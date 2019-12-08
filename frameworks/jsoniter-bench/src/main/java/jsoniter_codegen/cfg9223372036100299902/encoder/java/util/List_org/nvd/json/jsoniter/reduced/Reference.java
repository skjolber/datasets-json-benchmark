package jsoniter_codegen.cfg9223372036100299902.encoder.java.util.List_org.nvd.json.jsoniter.reduced;
public class Reference implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.write((byte)'[');
encode_((java.util.List)obj, stream);
stream.write((byte)']');
}
public static void encode_(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
java.util.List list = (java.util.List)obj;
int size = list.size();
if (size == 0) { return; }
java.lang.Object e = list.get(0);
if (e == null) { stream.writeNull(); } else {
stream.writeRaw("{\"name\":", 8);
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.Reference.encode_((org.nvd.json.jsoniter.reduced.Reference)e, stream);
stream.write((byte)'}');
}
for (int i = 1; i < size; i++) {
stream.write(',');
e = list.get(i);
if (e == null) { stream.writeNull(); } else {
stream.writeRaw("{\"name\":", 8);
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.Reference.encode_((org.nvd.json.jsoniter.reduced.Reference)e, stream);
stream.write((byte)'}');
}
}
}
}
