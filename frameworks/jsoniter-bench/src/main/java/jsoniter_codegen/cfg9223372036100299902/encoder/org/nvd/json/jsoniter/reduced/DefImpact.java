package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class DefImpact implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"baseMetricV3\":", 16);
encode_((org.nvd.json.jsoniter.reduced.DefImpact)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.DefImpact obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getBaseMetricV3() == null) { stream.writeNull(); } else {
stream.writeRaw("{\"cvssV3\":", 10);
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.BaseMetricV3.encode_((org.nvd.json.jsoniter.reduced.BaseMetricV3)obj.getBaseMetricV3(), stream);
stream.write((byte)'}');
}
stream.writeRaw(",\"baseMetricV2\":", 16);
if (obj.getBaseMetricV2() == null) { stream.writeNull(); } else {
stream.writeRaw("{\"cvssV2\":", 10);
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.BaseMetricV2.encode_((org.nvd.json.jsoniter.reduced.BaseMetricV2)obj.getBaseMetricV2(), stream);
stream.write((byte)'}');
}
}
}
