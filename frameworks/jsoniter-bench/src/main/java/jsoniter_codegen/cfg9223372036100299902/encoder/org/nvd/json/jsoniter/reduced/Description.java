package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class Description implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"description_data\":", 20);
encode_((org.nvd.json.jsoniter.reduced.Description)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.Description obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getDescriptionData() == null) { stream.writeNull(); } else {
stream.write((byte)'[');
jsoniter_codegen.cfg9223372036100299902.encoder.java.util.List_org.nvd.json.jsoniter.reduced.LangString.encode_((java.util.List)obj.getDescriptionData(), stream);
stream.write((byte)']');
}
}
}
