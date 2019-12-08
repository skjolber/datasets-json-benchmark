package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class CvssV20 implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"accessVector\":", 16);
encode_((org.nvd.json.jsoniter.reduced.CvssV20)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.CvssV20 obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getAccessVector() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV20_AccessVectorType.encode_((org.nvd.json.jsoniter.reduced.CvssV20.AccessVectorType)obj.getAccessVector(), stream);
stream.write((byte)'\"');
}
stream.writeRaw(",\"accessComplexity\":", 20);
if (obj.getAccessComplexity() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV20_AccessComplexityType.encode_((org.nvd.json.jsoniter.reduced.CvssV20.AccessComplexityType)obj.getAccessComplexity(), stream);
stream.write((byte)'\"');
}
stream.writeRaw(",\"authentication\":", 18);
if (obj.getAuthentication() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV20_AuthenticationType.encode_((org.nvd.json.jsoniter.reduced.CvssV20.AuthenticationType)obj.getAuthentication(), stream);
stream.write((byte)'\"');
}
stream.writeRaw(",\"confidentialityImpact\":", 25);
if (obj.getConfidentialityImpact() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV20_CiaType.encode_((org.nvd.json.jsoniter.reduced.CvssV20.CiaType)obj.getConfidentialityImpact(), stream);
stream.write((byte)'\"');
}
stream.writeRaw(",\"integrityImpact\":", 19);
if (obj.getIntegrityImpact() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV20_CiaType.encode_((org.nvd.json.jsoniter.reduced.CvssV20.CiaType)obj.getIntegrityImpact(), stream);
stream.write((byte)'\"');
}
stream.writeRaw(",\"availabilityImpact\":", 22);
if (obj.getAvailabilityImpact() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV20_CiaType.encode_((org.nvd.json.jsoniter.reduced.CvssV20.CiaType)obj.getAvailabilityImpact(), stream);
stream.write((byte)'\"');
}
stream.writeRaw(",\"baseScore\":", 13);
if (obj.getBaseScore() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.Double)obj.getBaseScore());
}
}
}
