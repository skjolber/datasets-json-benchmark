package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class DefCveItem implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"cve\":", 7);
encode_((org.nvd.json.jsoniter.reduced.DefCveItem)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.DefCveItem obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getCve() == null) { stream.writeNull(); } else {
stream.writeRaw("{\"description\":", 15);
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CVEJSON40Min.encode_((org.nvd.json.jsoniter.reduced.CVEJSON40Min)obj.getCve(), stream);
stream.write((byte)'}');
}
stream.writeRaw(",\"configurations\":", 18);
if (obj.getConfigurations() == null) { stream.writeNull(); } else {
stream.writeRaw("{\"nodes\":", 9);
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.DefConfigurations.encode_((org.nvd.json.jsoniter.reduced.DefConfigurations)obj.getConfigurations(), stream);
stream.write((byte)'}');
}
stream.writeRaw(",\"impact\":", 10);
if (obj.getImpact() == null) { stream.writeNull(); } else {
stream.writeRaw("{\"baseMetricV3\":", 16);
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.DefImpact.encode_((org.nvd.json.jsoniter.reduced.DefImpact)obj.getImpact(), stream);
stream.write((byte)'}');
}
}
}
