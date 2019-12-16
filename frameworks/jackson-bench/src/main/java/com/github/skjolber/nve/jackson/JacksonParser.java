package com.github.skjolber.nve.jackson;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;

public class JacksonParser<T> implements Iterator<T>, Closeable {

	protected JsonParser parser;
	protected ObjectReader readerFor;
	
	public JacksonParser(byte[] contents, Class<T> type) throws IOException {
		this(new ByteArrayInputStream(contents), type);
	}

	public JacksonParser(byte[] contents, ObjectReader reader) throws IOException {
		this(new ByteArrayInputStream(contents), reader);
	}

	public JacksonParser(InputStream in, ObjectReader reader) throws IOException {
		this.readerFor = reader;
		this.parser = readerFor.getFactory().createParser(in);
		init();
	}	
	
	public JacksonParser(InputStream in, Class<T> type) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new AfterburnerModule());
		
		this.readerFor = objectMapper.readerFor(type);
		this.parser = readerFor.getFactory().createParser(in);
		
		init();
	}		

	protected void init() throws IOException {
		com.fasterxml.jackson.core.JsonToken nextToken = parser.nextToken();
		if(nextToken != com.fasterxml.jackson.core.JsonToken.START_OBJECT) {
			throw new RuntimeException();
		}

		do {
			nextToken = parser.nextToken();
			if(nextToken == null) {
				break;
			}

			if(nextToken.isStructStart()) {
				if(nextToken == com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
					break;
				} else {
					parser.skipChildren();
				}
			}
		} while(true);
	}
	
	@Override
	public boolean hasNext() {
		try {
			return parser.nextToken() == com.fasterxml.jackson.core.JsonToken.START_OBJECT;
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	@Override
	public T next() {
		try {
			return (T)readerFor.readValue(parser);
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
	}

	@Override
	public void close() throws IOException {
		parser.close();
	}
	
}
