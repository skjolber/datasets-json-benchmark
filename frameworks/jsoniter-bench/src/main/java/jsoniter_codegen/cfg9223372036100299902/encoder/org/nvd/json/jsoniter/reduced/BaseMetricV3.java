package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class BaseMetricV3 implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"cvssV3\":", 10);
encode_((org.nvd.json.jsoniter.reduced.BaseMetricV3)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.BaseMetricV3 obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getCvssV3() == null) { stream.writeNull(); } else {
stream.writeRaw("{\"scope\":", 9);
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV30.encode_((org.nvd.json.jsoniter.reduced.CvssV30)obj.getCvssV3(), stream);
stream.write((byte)'}');
}
}
}
