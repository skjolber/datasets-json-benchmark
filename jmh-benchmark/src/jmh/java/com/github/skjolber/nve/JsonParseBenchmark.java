package com.github.skjolber.nve;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.nvd.json.jsoniter.generator.DemoCodegenConfig;
import org.openjdk.jmh.annotations.Benchmark;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.github.skjolber.nve.jackson.FullParser;
import com.github.skjolber.nve.jackson.ReducedParser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.jsoniter.JsonIterator;
import com.jsoniter.output.EncodingMode;
import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.DecodingMode;

public class JsonParseBenchmark {

	@Benchmark
    public int gson_parse_full(DatabindingBenchmarkState state) throws Exception {
		int count = 0;
		
		List<byte[]> contents = state.getContents();
		
		for(byte[] content : contents) {
			try (InputStream in  = new ByteArrayInputStream(content);
					InputStreamReader r = new InputStreamReader(in);
	                JsonReader reader = new JsonReader(r)) {
	            final Gson gson = new GsonBuilder().create();
	
	            reader.beginObject();
	
	            while (reader.hasNext() && !JsonToken.BEGIN_ARRAY.equals(reader.peek())) {
	                reader.skipValue();
	            }
	            reader.beginArray();
	            while (reader.hasNext()) {
	                final org.nvd.json.gson.DefCveItem cve = gson.fromJson(reader, org.nvd.json.gson.DefCveItem.class);
	                if(cve != null) {
	                	count += cve.getCve().getReferences().getReferenceData().size();
	                }
	            }
	        } catch (Exception ex) {
	        	throw new RuntimeException(ex);
	        }		
		}
		
		return count;
    }

	@Benchmark
    public int gson_parse_reduced(DatabindingBenchmarkState state) throws Exception {
		int count = 0;
		
		List<byte[]> contents = state.getContents();
		
		for(byte[] content : contents) {
			try (InputStream in  = new ByteArrayInputStream(content);
					InputStreamReader r = new InputStreamReader(in);
	                JsonReader reader = new JsonReader(r)) {
	            final Gson gson = new GsonBuilder().create();
	            reader.setLenient(true);
	            reader.beginObject();
	
	            while (reader.hasNext() && !JsonToken.BEGIN_ARRAY.equals(reader.peek())) {
	                reader.skipValue();
	            }
	            reader.beginArray();
	            while (reader.hasNext()) {
	                final org.nvd.json.gson.reduced.DefCveItem cve = gson.fromJson(reader, org.nvd.json.gson.reduced.DefCveItem.class);
	                if(cve != null) {
	                	count += cve.getCve().getReferences().getReferenceData().size();
	                }
	            }
	        } catch (Exception ex) {
	        	throw new RuntimeException(ex);
	        }		
		}
		
		return count;
    }

	@Benchmark
    public int jackson_parse_full(DatabindingBenchmarkState state) {
		return FullParser.count(state.getContents());
    }

	@Benchmark
    public int jackson_parse_reduced(DatabindingBenchmarkState state) {
		return ReducedParser.count(state.getContents());
    }
	
	@Benchmark
    public int jsoniter_parse_reduced(DatabindingBenchmarkState state) throws IOException {
		
		int count = 0;
		
		List<byte[]> contents = state.getContents();

		for(byte[] content : contents) {
			try (JsonIterator iter = JsonIterator.parse(content)) {
				for (String field = iter.readObject(); field != null; field = iter.readObject()) {
			        switch (field) {
			            case "CVE_Items":
			                while (iter.readArray()) {
			                	
			                	org.nvd.json.jsoniter.reduced.DefCveItem cve = iter.read(org.nvd.json.jsoniter.reduced.DefCveItem.class);
			                    
				                if(cve != null) {
				                	count += cve.getCve().getReferences().getReferenceData().size();
				                }
			                    
			                    count ++;
			                }
			                break;
			            default:
			                iter.skip();
			        }
			    }
			}
		}
		return count;
	}
	
	@Benchmark
    public int jsoniter_parse_reduced_precompiled(DatabindingBenchmarkState state) throws IOException {
		
		new DemoCodegenConfig().setup();

		int count = 0;
		
		List<byte[]> contents = state.getContents();

		for(byte[] content : contents) {
			try (JsonIterator iter = JsonIterator.parse(content)) {
				for (String field = iter.readObject(); field != null; field = iter.readObject()) {
			        switch (field) {
			            case "CVE_Items":
			                while (iter.readArray()) {
			                	
			                	org.nvd.json.jsoniter.reduced.DefCveItem cve = iter.read(org.nvd.json.jsoniter.reduced.DefCveItem.class);
			                    
				                if(cve != null) {
				                	count += cve.getCve().getReferences().getReferenceData().size();
				                }
			                    
			                    count ++;
			                }
			                break;
			            default:
			                iter.skip();
			        }
			    }
			}
		}
		return count;
	}

	@Benchmark
    public int jsoniter_parse_full(DatabindingBenchmarkState state) throws IOException {
		int count = 0;
		
		List<byte[]> contents = state.getContents();

		for(byte[] content : contents) {
			try (JsonIterator iter = JsonIterator.parse(content)) {
				for (String field = iter.readObject(); field != null; field = iter.readObject()) {
			        switch (field) {
			            case "CVE_Items":
			                while (iter.readArray()) {
			                	
			                	org.nvd.json.jsoniter.DefCveItem cve = iter.read(org.nvd.json.jsoniter.DefCveItem.class);
			                    
				                if(cve != null) {
				                	count += cve.getCve().getReferences().getReferenceData().size();
				                }
			                    
			                    count ++;
			                }
			                break;
			            default:
			                iter.skip();
			        }
			    }
			}
		}
		return count;
	}	
}
