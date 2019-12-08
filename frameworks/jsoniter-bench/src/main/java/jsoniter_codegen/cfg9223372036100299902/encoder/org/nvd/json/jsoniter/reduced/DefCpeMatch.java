package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class DefCpeMatch implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"vulnerable\":", 14);
encode_((org.nvd.json.jsoniter.reduced.DefCpeMatch)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.DefCpeMatch obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getVulnerable() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.Boolean)obj.getVulnerable());
}
stream.writeRaw(",\"cpe22Uri\":", 12);
if (obj.getCpe22Uri() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.getCpe22Uri());
}
stream.writeRaw(",\"cpe23Uri\":", 12);
if (obj.getCpe23Uri() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.getCpe23Uri());
}
stream.writeRaw(",\"versionStartExcluding\":", 25);
if (obj.getVersionStartExcluding() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.getVersionStartExcluding());
}
stream.writeRaw(",\"versionStartIncluding\":", 25);
if (obj.getVersionStartIncluding() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.getVersionStartIncluding());
}
stream.writeRaw(",\"versionEndExcluding\":", 23);
if (obj.getVersionEndExcluding() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.getVersionEndExcluding());
}
stream.writeRaw(",\"versionEndIncluding\":", 23);
if (obj.getVersionEndIncluding() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.getVersionEndIncluding());
}
}
}
