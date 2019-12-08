package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class CvssV20_AccessComplexityType implements com.jsoniter.spi.Decoder {
public static java.lang.Object decode_(com.jsoniter.JsonIterator iter) throws java.io.IOException { if (iter.readNull()) { return null; }
com.jsoniter.spi.Slice field = com.jsoniter.CodegenAccess.readSlice(iter);
switch (field.len()) {
case 3: 
if (
field.at(0)==76 && 
field.at(1)==79 && 
field.at(2)==87
) {
return org.nvd.json.jsoniter.reduced.CvssV20.AccessComplexityType.LOW;
}
break;
case 4: 
if (
field.at(0)==72 && 
field.at(1)==73 && 
field.at(2)==71 && 
field.at(3)==72
) {
return org.nvd.json.jsoniter.reduced.CvssV20.AccessComplexityType.HIGH;
}
break;
case 6: 
if (
field.at(0)==77 && 
field.at(1)==69 && 
field.at(2)==68 && 
field.at(3)==73 && 
field.at(4)==85 && 
field.at(5)==77
) {
return org.nvd.json.jsoniter.reduced.CvssV20.AccessComplexityType.MEDIUM;
}
break;

}
throw iter.reportError("decode enum", field + " is not valid enum for org.nvd.json.jsoniter.reduced.CvssV20.AccessComplexityType");
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
