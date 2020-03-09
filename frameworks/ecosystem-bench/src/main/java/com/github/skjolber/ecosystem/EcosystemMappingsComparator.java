package com.github.skjolber.ecosystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class EcosystemMappingsComparator {

	private static final String ADDED_POSTFIX = ".added.txt";
	private static final String REMOVED_POSTFIX = ".removed.txt";
	private static final String KEPT_POSTFIX = ".neutral.txt";

	private final File outputDirectory;

	public EcosystemMappingsComparator(File outputDirectory) {
		super();
		this.outputDirectory = outputDirectory;
	}

	public void compare(File f1, File f2) throws IOException {
		compare(new EcosystemMappingsReader(f1), new EcosystemMappingsReader(f2));
	}

	public void compare(EcosystemMappingsReader r1, EcosystemMappingsReader r2) throws IOException {
		Set<String> sets1 = r1.getEcosystems();
		Set<String> sets2 = r2.getEcosystems();
		
		Set<String> ecosystems = new HashSet<>();
		ecosystems.addAll(sets1);
		ecosystems.addAll(sets2);
		
		for(String ecosystem : ecosystems) {
			PrintWriter added = new PrintWriter(new FileWriter(new File(outputDirectory, ecosystem + ADDED_POSTFIX)));
			PrintWriter removed = new PrintWriter(new FileWriter(new File(outputDirectory, ecosystem + REMOVED_POSTFIX)));
			PrintWriter kept = new PrintWriter(new FileWriter(new File(outputDirectory, ecosystem + KEPT_POSTFIX)));

			Set<String> s1 = toSet(r1.getEcosystem(ecosystem));
			Set<String> s2 = toSet(r2.getEcosystem(ecosystem));

			if(sets1.contains(ecosystem) && sets2.contains(ecosystem)) {
				// compare
				
				int addedCount = 0;
				// added
				for(String s : s2) {
					if(!s1.contains(s)) {
						added.println(s);
						addedCount++;
					}
				}
				System.out.println(ecosystem + " added " + addedCount);
				
				int removedCount = 0;
				// removed
				for(String s : s1) {
					if(!s2.contains(s)) {
						removed.println(s);
						removedCount++;
					}
				}
				System.out.println(ecosystem + " removed " + removedCount);

				int keptCount = 0;
				// neutral
				for(String s : s1) {
					if(s2.contains(s)) {
						kept.println(s);
						keptCount++;
					}
				}
				System.out.println(ecosystem + " kept " + keptCount);
				
			} else if(sets1.contains(ecosystem)) {
				// all have been removed
				for(String s : s1) {
					removed.println(s);
				}

				System.out.println(ecosystem + " removed " + s1.size() + " (all)");
			} else if(sets2.contains(ecosystem)) {
				// all strings have been added
				for(String s : s2) {
					added.println(s);
				}
				System.out.println(ecosystem + " added " + s2.size() + " (all)");
			}
			
			added.close();
			removed.close();
			kept.close();
		}
	}

	private Set<String> toSet(BufferedReader input) throws IOException {
		Set<String> strings = new HashSet<>();
		
		String str;
		do {
			str = input.readLine();
			if(str == null) {
				break;
			}
			strings.add(str);
		} while(true);
		
		return strings;
	}
	
}
 