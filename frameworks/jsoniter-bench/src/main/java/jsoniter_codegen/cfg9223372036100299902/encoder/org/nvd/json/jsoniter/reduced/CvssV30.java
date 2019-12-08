package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class CvssV30 implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"scope\":", 9);
encode_((org.nvd.json.jsoniter.reduced.CvssV30)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.CvssV30 obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getScope() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV30_ScopeType.encode_((org.nvd.json.jsoniter.reduced.CvssV30.ScopeType)obj.getScope(), stream);
stream.write((byte)'\"');
}
stream.writeRaw(",\"attackVector\":", 16);
if (obj.getAttackVector() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV30_AttackVectorType.encode_((org.nvd.json.jsoniter.reduced.CvssV30.AttackVectorType)obj.getAttackVector(), stream);
stream.write((byte)'\"');
}
stream.writeRaw(",\"confidentialityImpact\":", 25);
if (obj.getConfidentialityImpact() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV30_CiaType.encode_((org.nvd.json.jsoniter.reduced.CvssV30.CiaType)obj.getConfidentialityImpact(), stream);
stream.write((byte)'\"');
}
stream.writeRaw(",\"integrityImpact\":", 19);
if (obj.getIntegrityImpact() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV30_CiaType.encode_((org.nvd.json.jsoniter.reduced.CvssV30.CiaType)obj.getIntegrityImpact(), stream);
stream.write((byte)'\"');
}
stream.writeRaw(",\"availabilityImpact\":", 22);
if (obj.getAvailabilityImpact() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV30_CiaType.encode_((org.nvd.json.jsoniter.reduced.CvssV30.CiaType)obj.getAvailabilityImpact(), stream);
stream.write((byte)'\"');
}
stream.writeRaw(",\"baseScore\":", 13);
if (obj.getBaseScore() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.Double)obj.getBaseScore());
}
stream.writeRaw(",\"attackComplexity\":", 20);
if (obj.getAttackComplexity() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV30_AttackComplexityType.encode_((org.nvd.json.jsoniter.reduced.CvssV30.AttackComplexityType)obj.getAttackComplexity(), stream);
stream.write((byte)'\"');
}
stream.writeRaw(",\"privilegesRequired\":", 22);
if (obj.getPrivilegesRequired() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV30_PrivilegesRequiredType.encode_((org.nvd.json.jsoniter.reduced.CvssV30.PrivilegesRequiredType)obj.getPrivilegesRequired(), stream);
stream.write((byte)'\"');
}
stream.writeRaw(",\"userInteraction\":", 19);
if (obj.getUserInteraction() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV30_UserInteractionType.encode_((org.nvd.json.jsoniter.reduced.CvssV30.UserInteractionType)obj.getUserInteraction(), stream);
stream.write((byte)'\"');
}
stream.writeRaw(",\"baseSeverity\":", 16);
if (obj.getBaseSeverity() == null) { stream.writeNull(); } else {
stream.write((byte)'\"');
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CvssV30_SeverityType.encode_((org.nvd.json.jsoniter.reduced.CvssV30.SeverityType)obj.getBaseSeverity(), stream);
stream.write((byte)'\"');
}
}
}
