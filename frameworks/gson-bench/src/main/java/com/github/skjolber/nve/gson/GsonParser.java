package com.github.skjolber.nve.gson;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

public class GsonParser<T> implements Iterator<T>, Closeable {

	protected final JsonReader reader;
	protected final Gson gson;
	protected Class<T> type;

	public GsonParser(byte[] contents, Class<T> type) throws IOException {
		this(new ByteArrayInputStream(contents), new GsonBuilder().create(), type);
	}

	public GsonParser(byte[] contents, Gson gson, Class<T> type) throws IOException {
		this(new ByteArrayInputStream(contents), gson, type);
	}

	public GsonParser(ByteArrayInputStream in, Gson gson, Class<T> type) throws IOException {
		InputStreamReader r = new InputStreamReader(in);
		this.gson = gson;
        this.reader = new JsonReader(r);
        this.type = type;
        init();
	}

	protected void init() throws IOException {
	    reader.beginObject();
	
	    while (reader.hasNext() && !JsonToken.BEGIN_ARRAY.equals(reader.peek())) {
	        reader.skipValue();
	    }
	    reader.beginArray();		
	}
	
	@Override
	public boolean hasNext() {
		try {
			return reader.hasNext();
		} catch (IOException e) {
			throw new JsonIOException(e);
		}
	}
	
	@Override
	public T next() {
		return gson.fromJson(reader, type);
	}

	@Override
	public void close() throws IOException {
		reader.close();
	}
	
}
