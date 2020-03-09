package com.github.skjolber.ecosystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EcosystemMappingsWriter {

	private static final String POSTFIX = ".ecosystem.txt";

	private final File outputDirectory;
	
	private Map<String, PrintWriter> writers = new HashMap<>();

	public EcosystemMappingsWriter(File outputDirectory) {
		super();
		this.outputDirectory = outputDirectory;
		
		if(!outputDirectory.exists() && !outputDirectory.mkdirs()) {
			throw new RuntimeException();
		}
	}
	
	public void add(String string, String ecosystem) throws IOException {
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
	
	
}
