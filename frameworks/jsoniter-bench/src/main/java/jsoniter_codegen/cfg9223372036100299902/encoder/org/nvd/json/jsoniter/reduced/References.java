package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class References implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"reference_data\":", 18);
encode_((org.nvd.json.jsoniter.reduced.References)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.References obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getReferenceData() == null) { stream.writeNull(); } else {
stream.write((byte)'[');
jsoniter_codegen.cfg9223372036100299902.encoder.java.util.List_org.nvd.json.jsoniter.reduced.Reference.encode_((java.util.List)obj.getReferenceData(), stream);
stream.write((byte)']');
}
}
}
