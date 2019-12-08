package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class CVEDataMeta implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"ID\":", 6);
encode_((org.nvd.json.jsoniter.reduced.CVEDataMeta)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.CVEDataMeta obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getId() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.getId());
}
}
}
