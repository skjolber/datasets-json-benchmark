package com.github.skjolber.ecosystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EcosystemMappingsReader {

	private static final String POSTFIX = ".ecosystem.txt";
	
	private final File inputDirectory;

	public EcosystemMappingsReader(File inputDirectory) {
		super();
		this.inputDirectory = inputDirectory;
		
		if(!inputDirectory.exists()) {
			throw new RuntimeException();
		}
	}
	
	public Set<String> getEcosystems() {
		String[] list = inputDirectory.list( (d, name) -> name.endsWith(POSTFIX));
		
		Set<String> ecosystems = new HashSet<>();
		for(String file : list) {
			ecosystems.add(file.substring(0, file.length() - POSTFIX.length()));
		}
		return ecosystems;
	}
	
	public BufferedReader getEcosystem(String ecosystem) throws IOException {
		File file = new File(inputDirectory, ecosystem + POSTFIX);
		if(file.exists()) {
			return new BufferedReader(new FileReader(file));
		}
		return null;
	}

}
