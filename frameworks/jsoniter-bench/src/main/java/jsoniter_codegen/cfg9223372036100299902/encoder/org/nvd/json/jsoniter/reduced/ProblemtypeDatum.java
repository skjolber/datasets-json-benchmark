package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class ProblemtypeDatum implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"description\":", 15);
encode_((org.nvd.json.jsoniter.reduced.ProblemtypeDatum)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.ProblemtypeDatum obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getDescription() == null) { stream.writeNull(); } else {
stream.write((byte)'[');
jsoniter_codegen.cfg9223372036100299902.encoder.java.util.List_org.nvd.json.jsoniter.reduced.LangString.encode_((java.util.List)obj.getDescription(), stream);
stream.write((byte)']');
}
}
}
