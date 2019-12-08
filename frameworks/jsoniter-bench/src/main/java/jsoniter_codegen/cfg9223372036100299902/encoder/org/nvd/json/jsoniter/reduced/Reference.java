package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class Reference implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"name\":", 8);
encode_((org.nvd.json.jsoniter.reduced.Reference)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.Reference obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getName() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.getName());
}
stream.writeRaw(",\"url\":", 7);
if (obj.getUrl() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.getUrl());
}
stream.writeRaw(",\"refsource\":", 13);
if (obj.getRefsource() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.getRefsource());
}
}
}
