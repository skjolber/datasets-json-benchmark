package com.github.skjolber.ecosystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class EcosystemMappingsWriter {

	private static final String POSTFIX = ".ecosystem.txt";

	private final File outputDirectory;
	
	private Map<String, PrintWriter> writers = new HashMap<>();
	
	private Function<String, String> mapper;

	public EcosystemMappingsWriter(File outputDirectory, Function<String, String> mapper) {
		super();
		this.outputDirectory = outputDirectory;
		this.mapper = mapper;
		
		if(!outputDirectory.exists()) {
			if(!outputDirectory.mkdirs()) {
				throw new RuntimeException();
			}
		} else {
			// clean up
			String[] list = outputDirectory.list( (d, name) -> name.endsWith(POSTFIX));
			for(String fileName : list) {
				new File(outputDirectory, fileName).delete();
			}
		}
	}
	
	public void add(String string) throws IOException {
		add(string, mapper.apply(string));
	}
	
	protected void add(String string, String ecosystem) throws IOException {
		PrintWriter writer = writers.get(ecosystem);
		if(writer == null) {
			writer = new PrintWriter(new FileWriter(new File(outputDirectory, ecosystem + POSTFIX)));
			
			writers.put(ecosystem, writer);
		}
		
		writer.println(string);
		
	}

	public void close() throws IOException {
		for (Entry<String, PrintWriter> entry : writers.entrySet()) {
			entry.getValue().close();
		}
	}
	
	public File getOutputDirectory() {
		return outputDirectory;
	}
	
	
}
