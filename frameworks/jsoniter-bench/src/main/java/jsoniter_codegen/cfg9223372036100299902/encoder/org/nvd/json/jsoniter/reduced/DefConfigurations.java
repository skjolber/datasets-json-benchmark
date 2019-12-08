package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class DefConfigurations implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"nodes\":", 9);
encode_((org.nvd.json.jsoniter.reduced.DefConfigurations)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.DefConfigurations obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getNodes() == null) { stream.writeNull(); } else {
stream.write((byte)'[');
jsoniter_codegen.cfg9223372036100299902.encoder.java.util.List_org.nvd.json.jsoniter.reduced.DefNode.encode_((java.util.List)obj.getNodes(), stream);
stream.write((byte)']');
}
}
}
