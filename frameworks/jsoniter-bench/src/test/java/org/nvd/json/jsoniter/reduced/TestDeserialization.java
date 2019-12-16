package org.nvd.json.jsoniter.reduced;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.nvd.json.jsoniter.reduced.DefCveItem;
import org.nvd.json.jsoniter.reduced.NvdCveFeedJson10;
import org.nvd.json.jsoniter.generator.DemoCodegenConfig;

import com.github.skjolber.bench.utils.GZipUtility;
import com.jsoniter.JsonIterator;
import com.jsoniter.spi.DecodingMode;

public class TestDeserialization {

    
	@Test
	public void testSingle() throws IOException {
		new DemoCodegenConfig().setup();
		byte[] byteArray = IOUtils.toByteArray(getClass().getResourceAsStream("/cve2.json"));
		DefCveItem item = JsonIterator.deserialize(byteArray, DefCveItem.class);
	}
	
	@Test
	@Disabled("Runs on local machine, not on travis?")
	public void testMultiple() throws IOException {
		byte[] byteArray = IOUtils.toByteArray(getClass().getResourceAsStream("/cves2.json"));
		NvdCveFeedJson10 item = JsonIterator.deserialize(byteArray, NvdCveFeedJson10.class);

		DefCveItem defCveItem = item.getCVEItems().get(0);
		String id = defCveItem.getCve().getCVEDataMeta().getId();
		System.out.println(id);
	}	
	
	@Test
	public void testIterator() throws IOException {
		new DemoCodegenConfig().setup();

		byte[] byteArray = IOUtils.toByteArray(getClass().getResourceAsStream("/cves2.json"));
		
		JsonIterator iter = JsonIterator.parse(byteArray);
		for (String field = iter.readObject(); field != null; field = iter.readObject()) {
	        switch (field) {
	            case "CVE_Items":
	                while (iter.readArray()) {
                        DefCveItem read = iter.read(DefCveItem.class);
                        System.out.println("Read " + read.getCve().getCVEDataMeta().getId());
	                }
	                break;
	            default:
	                iter.skip();
	        }
	    }	
		iter.close();
	}
	
	@Test
	@Disabled
	public void testIteratorGz() throws IOException {
		File file = new File("../../jmh-benchmark/src/jmh/resources");
		System.out.println(file.getCanonicalPath());
		File outputDirectory = new File("/tmp/nve");
		GZipUtility utilitiy = new GZipUtility();
		List<File> unpack = utilitiy.toFiles(file, outputDirectory);

		JsonIterator iterator = new JsonIterator();
		
		System.out.println("Unpack " + unpack.size() + " files");
		for(File f : unpack) {
			System.out.println(f);
			FileInputStream fin = new FileInputStream(f);
			JsonIterator iter = iterator.parse(fin, 2*1024 * 1024);
	
			for (String field = iter.readObject(); field != null; field = iter.readObject()) {
		        switch (field) {
		            case "CVE_Items":
		                while (iter.readArray()) {
	                        DefCveItem read = iter.read(DefCveItem.class);
	                        System.out.println("Read " + read.getCve().getCVEDataMeta().getId());
		                }
		                break;
		            default:
		            	System.out.println("Skip");
		                iter.skip();
		        }
		    }	
			iter.close();
		}		
		
	}
}
