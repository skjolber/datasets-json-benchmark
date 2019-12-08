package jsoniter_codegen.cfg9223372036100299902.encoder.org.nvd.json.jsoniter.reduced;
public class LangString implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"value\":", 9);
encode_((org.nvd.json.jsoniter.reduced.LangString)obj, stream);
stream.write((byte)'}');
}
public static void encode_(org.nvd.json.jsoniter.reduced.LangString obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.getValue() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.getValue());
}
stream.writeRaw(",\"lang\":", 8);
if (obj.getLang() == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.getLang());
}
}
}
