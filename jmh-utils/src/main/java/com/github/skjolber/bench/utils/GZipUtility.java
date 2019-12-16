package com.github.skjolber.bench.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.IOUtils;

public class GZipUtility {

	public List<File> toFiles(File inputDirectory, File outputDirectory) throws IOException {
		List<File> outputFiles = new ArrayList<>();
		
		File[] inputFiles = inputDirectory.listFiles( (v) -> v.getName().endsWith(".gz"));
		if(inputFiles != null) {
			for(File inputFile : inputFiles) {
				File outputFile = new File(outputDirectory, inputFile.getName() + ".json");
				if(!outputFile.exists()) {
			        try (InputStream fin = new FileInputStream(inputFile);
		                InputStream in = new GZIPInputStream(fin);
		        		FileOutputStream fout = new FileOutputStream(outputFile)) {
			        	
			        	IOUtils.copy(in, fout);
			        }
				}
				outputFiles.add(outputFile);
			}
		}
		return outputFiles;
	}
	
	public Map<File, InputStream> toInputStreams(File inputDirectory) throws IOException {
		Map<File, InputStream> result = new HashMap<>();
		
		File[] inputFiles = inputDirectory.listFiles( (v) -> v.getName().endsWith(".gz"));
		if(inputFiles != null) {
			for(File inputFile : inputFiles) {
		        InputStream fin = new FileInputStream(inputFile);
		        result.put(inputFile, new GZIPInputStream(fin));
			}
		}
		return result;
	}
	
	public Map<File, byte[]> toBytes(File inputDirectory) throws IOException {
		Map<File, byte[]> result = new HashMap<>();
		
		File[] inputFiles = inputDirectory.listFiles( (v) -> v.getName().endsWith(".gz"));
		if(inputFiles != null) {
			for(File inputFile : inputFiles) {
		        try (InputStream fin = new FileInputStream(inputFile)) {
		        	result.put(inputFile, IOUtils.toByteArray(new GZIPInputStream(fin)));
		        }
			}
		}
		return result;
	}	
}