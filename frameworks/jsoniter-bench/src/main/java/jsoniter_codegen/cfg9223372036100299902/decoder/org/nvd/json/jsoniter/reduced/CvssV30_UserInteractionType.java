package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class CvssV30_UserInteractionType implements com.jsoniter.spi.Decoder {
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
return org.nvd.json.jsoniter.reduced.CvssV30.UserInteractionType.NONE;
}
break;
case 8: 
if (
field.at(0)==82 && 
field.at(1)==69 && 
field.at(2)==81 && 
field.at(3)==85 && 
field.at(4)==73 && 
field.at(5)==82 && 
field.at(6)==69 && 
field.at(7)==68
) {
return org.nvd.json.jsoniter.reduced.CvssV30.UserInteractionType.REQUIRED;
}
break;

}
throw iter.reportError("decode enum", field + " is not valid enum for org.nvd.json.jsoniter.reduced.CvssV30.UserInteractionType");
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
