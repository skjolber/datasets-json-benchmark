package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class CVEJSON40Min implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"description\":", 15);
encode_((org.nvd.json.jsoniter.reduced.CVEJSON40Min)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.CVEJSON40Min obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getDescription() == null) { stream.writeNull(); } else {
stream.writeRaw("{\"description_data\":", 20);
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.Description.encode_((org.nvd.json.jsoniter.reduced.Description)obj.getDescription(), stream);
stream.write((byte)'}');
}
stream.writeRaw(",\"problemtype\":", 15);
if (obj.getProblemtype() == null) { stream.writeNull(); } else {
stream.writeRaw("{\"problemtype_data\":", 20);
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.Problemtype.encode_((org.nvd.json.jsoniter.reduced.Problemtype)obj.getProblemtype(), stream);
stream.write((byte)'}');
}
stream.writeRaw(",\"references\":", 14);
if (obj.getReferences() == null) { stream.writeNull(); } else {
stream.writeRaw("{\"reference_data\":", 18);
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.References.encode_((org.nvd.json.jsoniter.reduced.References)obj.getReferences(), stream);
stream.write((byte)'}');
}
stream.writeRaw(",\"CVE_data_meta\":", 17);
if (obj.getCVEDataMeta() == null) { stream.writeNull(); } else {
stream.writeRaw("{\"ID\":", 6);
jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced.CVEDataMeta.encode_((org.nvd.json.jsoniter.reduced.CVEDataMeta)obj.getCVEDataMeta(), stream);
stream.write((byte)'}');
}
}
}
