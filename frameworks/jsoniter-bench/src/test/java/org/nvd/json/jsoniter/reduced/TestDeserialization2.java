package org.nvd.json.jsoniter.reduced;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.nvd.json.jsoniter.reduced.DefCveItem;
import org.nvd.json.jsoniter.generator.DemoCodegenConfig;

import com.github.skjolber.bench.utils.GZipUtility;
import com.jsoniter.JsonIterator;

public class TestDeserialization2 {
	
	@Test
	public void testIteratorGz() throws IOException {
		new DemoCodegenConfig().setup();
		File file = new File("../../jmh-benchmark/src/jmh/resources/data/nve");
		
		File outputDirectory = new File("/tmp/nve");
		GZipUtility utilitiy = new GZipUtility();
		List<File> unpack = utilitiy.unpack(file, outputDirectory);

		System.out.println("Unpack " + unpack.size() + " files");
		for(File f : unpack) {
			System.out.println(f);
			FileInputStream fin = new FileInputStream(f);
			byte[] byteArray = IOUtils.toByteArray(fin);
			JsonIterator iter = JsonIterator.parse(byteArray);
	
			for (String field = iter.readObject(); field != null; field = iter.readObject()) {
		        switch (field) {
		            case "CVE_Items":
		                while (iter.readArray()) {
	                        DefCveItem read = iter.read(DefCveItem.class);
		                }
		                break;
		            default:
		                iter.skip();
		        }
		    }	
			iter.close();
		}		
		
	}
}
