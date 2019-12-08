package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class Problemtype implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"problemtype_data\":", 20);
encode_((org.nvd.json.jsoniter.reduced.Problemtype)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.Problemtype obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getProblemtypeData() == null) { stream.writeNull(); } else {
stream.write((byte)'[');
jsoniter_codegen.cfg9223372036100299902.encoder.java.util.List_org.nvd.json.jsoniter.reduced.ProblemtypeDatum.encode_((java.util.List)obj.getProblemtypeData(), stream);
stream.write((byte)']');
}
}
}
