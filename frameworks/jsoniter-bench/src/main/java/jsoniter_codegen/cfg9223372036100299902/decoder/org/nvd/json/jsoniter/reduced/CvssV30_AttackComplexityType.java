package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class CvssV30_AttackComplexityType implements com.jsoniter.spi.Decoder {
public static java.lang.Object decode_(com.jsoniter.JsonIterator iter) throws java.io.IOException { if (iter.readNull()) { return null; }
com.jsoniter.spi.Slice field = com.jsoniter.CodegenAccess.readSlice(iter);
switch (field.len()) {
case 3: 
if (
field.at(0)==76 && 
field.at(1)==79 && 
field.at(2)==87
) {
return org.nvd.json.jsoniter.reduced.CvssV30.AttackComplexityType.LOW;
}
break;
case 4: 
if (
field.at(0)==72 && 
field.at(1)==73 && 
field.at(2)==71 && 
field.at(3)==72
) {
return org.nvd.json.jsoniter.reduced.CvssV30.AttackComplexityType.HIGH;
}
break;

}
throw iter.reportError("decode enum", field + " is not valid enum for org.nvd.json.jsoniter.reduced.CvssV30.AttackComplexityType");
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
