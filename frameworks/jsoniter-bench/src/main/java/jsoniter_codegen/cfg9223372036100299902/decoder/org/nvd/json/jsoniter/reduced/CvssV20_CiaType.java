package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class CvssV20_CiaType implements com.jsoniter.spi.Decoder {
public static java.lang.Object decode_(com.jsoniter.JsonIterator iter) throws java.io.IOException { if (iter.readNull()) { return null; }
com.jsoniter.spi.Slice field = com.jsoniter.CodegenAccess.readSlice(iter);
switch (field.len()) {
case 4: 
if (
field.at(0)==78 && 
field.at(1)==79 && 
field.at(2)==78 && 
field.at(3)==69
) {
return org.nvd.json.jsoniter.reduced.CvssV20.CiaType.NONE;
}
break;
case 7: 
if (
field.at(0)==80 && 
field.at(1)==65 && 
field.at(2)==82 && 
field.at(3)==84 && 
field.at(4)==73 && 
field.at(5)==65 && 
field.at(6)==76
) {
return org.nvd.json.jsoniter.reduced.CvssV20.CiaType.PARTIAL;
}
break;
case 8: 
if (
field.at(0)==67 && 
field.at(1)==79 && 
field.at(2)==77 && 
field.at(3)==80 && 
field.at(4)==76 && 
field.at(5)==69 && 
field.at(6)==84 && 
field.at(7)==69
) {
return org.nvd.json.jsoniter.reduced.CvssV20.CiaType.COMPLETE;
}
break;

}
throw iter.reportError("decode enum", field + " is not valid enum for org.nvd.json.jsoniter.reduced.CvssV20.CiaType");
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
