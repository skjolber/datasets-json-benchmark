package com.github.skjolber.ecosystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.github.skjolber.bench.utils.EcoSystemGenerator;
import com.github.skjolber.nve.jackson.DescriptionGenerator;

public class Generator {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		System.out.println(new File(".").getCanonicalPath());
		DescriptionGenerator generator = new DescriptionGenerator();
		
		File inputDirectory = new File("../../jmh-benchmark/src/jmh/resources");
		
		File outputFile = File.createTempFile("descriptions.", ".txt");
		
		System.out.println("Generating descriptions");
		generator.generateDescriptions(inputDirectory, outputFile);
		
		System.out.println("Parse ecosystems");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(outputFile));

		File outputDirectory = new File("build/reports/ecosystem");
		if(!outputDirectory.exists() && !outputDirectory.mkdirs()) {
			throw new RuntimeException();
		}
		
		List<EcosystemMappingsWriter> writers = new ArrayList<>();
		
		writers.add(new EcosystemMappingsWriter(new File(outputDirectory, "reference/"), EcoSystemGenerator::determineBaseEcosystem));
		writers.add(new EcosystemMappingsWriter(new File(outputDirectory, "candidate/"), new AhoFunction()));
		
		write(bufferedReader, writers);
		
		for(EcosystemMappingsWriter writer : writers) {
			writer.close();
		}

		// assume first added is the reference
		for(int i = 1; i < writers.size(); i++) {
			EcosystemMappingsWriter w = writers.get(i);
			EcosystemMappingsComparator comp = new EcosystemMappingsComparator(new File(w.getOutputDirectory(), "diff"));
			
			comp.compare(writers.get(0).getOutputDirectory(), w.getOutputDirectory());
		}
		
	}
	
	private static void write(BufferedReader input, List<EcosystemMappingsWriter> writers) throws IOException {
		String str;
		do {
			str = input.readLine();
			if(str == null) {
				break;
			}
			for(EcosystemMappingsWriter writer : writers) {
				writer.add(str);
			}
		} while(true);
	}
	
}
