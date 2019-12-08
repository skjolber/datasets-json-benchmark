package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class DefNode implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"operator\":", 12);
encode_((org.nvd.json.jsoniter.reduced.DefNode)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.DefNode obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getOperator() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.getOperator());
}
stream.writeRaw(",\"children\":", 12);
if (obj.getChildren() == null) { stream.writeNull(); } else {
stream.write((byte)'[');
jsoniter_codegen.cfg9223372036100299902.encoder.java.util.List_org.nvd.json.jsoniter.reduced.DefNode.encode_((java.util.List)obj.getChildren(), stream);
stream.write((byte)']');
}
stream.writeRaw(",\"cpe_match\":", 13);
if (obj.getCpeMatch() == null) { stream.writeNull(); } else {
stream.write((byte)'[');
jsoniter_codegen.cfg9223372036100299902.encoder.java.util.List_org.nvd.json.jsoniter.reduced.DefCpeMatch.encode_((java.util.List)obj.getCpeMatch(), stream);
stream.write((byte)']');
}
}
}
