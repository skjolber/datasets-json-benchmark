package com.github.skjolber.nve;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.IOUtils;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import com.github.skjolber.bench.utils.GZipUtility;

@State(Scope.Thread)
public class BenchmarkState {

	private static final String resource = "/cve%d.json.gz";
	
	private File directory = new File("data/nve");
	
	private List<byte[]> contents;
	
	@Setup(Level.Trial)
	public void init() throws Exception {
		GZipUtility utility = new GZipUtility();
		
		File outputDirectory = new File("/tmp/nve");
		outputDirectory.mkdirs();
		
		List<File> files = utility.unpack(directory, outputDirectory);
		if(files != null && !files.isEmpty()) {
			contents = new ArrayList<>();
			for(File file : files) {
				try (InputStream in = new FileInputStream(file)) {
					byte[] byteArray = IOUtils.toByteArray(in);
					contents.add(byteArray);
				}
			}
		} else {
			throw new RuntimeException("No files in " + directory.getAbsolutePath());
		}
		/*
		contents = new ArrayList<>();
		
		for(int i = 2003; i < 2020; i++) {
			String format = String.format(resource,  i);
			System.out.println("Read " + format);
			
			try (InputStream fin = getClass().getResourceAsStream(format);
					InputStream in = new GZIPInputStream(fin);					
					) {
				byte[] byteArray = IOUtils.toByteArray(in);
				contents.add(byteArray);
			}
		}
		*/
	}
	
	public List<byte[]> getContents() {
		return contents;
	}
}
