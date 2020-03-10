package com.github.skjolber.nve.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.apache.commons.io.IOUtils;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import com.github.skjolber.nve.jackson.DescriptionGenerator;

@State(Scope.Thread)
public class EcoSystemBenchmarkState {

	private File directory = new File("data/nve");

	private List<String> content;

	@Setup(Level.Trial)
	public void setup() throws Exception {
		if(!directory.exists()) {
			if(!directory.mkdirs()) {
				throw new RuntimeException();
			}
		}
		File descriptions = new File(directory, "descriptions.txt");
		if(!descriptions.exists() || descriptions.length() == 0) {
			DescriptionGenerator generator = new DescriptionGenerator();
			generator.generateDescriptions(directory, descriptions);
		}
		System.out.println("Descriptions file " + descriptions + " size is " + descriptions.length() / (1024*1024) + " MB");

		try (InputStream in = new FileInputStream(descriptions)) {
			content = IOUtils.readLines(in, StandardCharsets.UTF_8);
		}
		if(content.isEmpty()) {
			throw new RuntimeException();
		}
	}

	public List<String> getContent() {
		return content;
	}

}


