package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class BaseMetricV2 implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"cvssV2\":", 10);
encode_((org.nvd.json.jsoniter.reduced.BaseMetricV2)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.BaseMetricV2 obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getCvssV2() == null) { stream.writeNull(); } else {
stream.writeRaw("{\"accessVector\":", 16);
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV20.encode_((org.nvd.json.jsoniter.reduced.CvssV20)obj.getCvssV2(), stream);
stream.write((byte)'}');
}
stream.writeRaw(",\"severity\":", 12);
if (obj.getSeverity() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.getSeverity());
}
}
}
