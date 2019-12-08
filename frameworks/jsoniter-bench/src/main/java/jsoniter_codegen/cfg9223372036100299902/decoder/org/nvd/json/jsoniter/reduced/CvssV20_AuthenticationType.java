package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class CvssV20_AuthenticationType implements com.jsoniter.spi.Decoder {
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
return org.nvd.json.jsoniter.reduced.CvssV20.AuthenticationType.NONE;
}
break;
case 6: 
if (
field.at(0)==83 && 
field.at(1)==73 && 
field.at(2)==78 && 
field.at(3)==71 && 
field.at(4)==76 && 
field.at(5)==69
) {
return org.nvd.json.jsoniter.reduced.CvssV20.AuthenticationType.SINGLE;
}
break;
case 8: 
if (
field.at(0)==77 && 
field.at(1)==85 && 
field.at(2)==76 && 
field.at(3)==84 && 
field.at(4)==73 && 
field.at(5)==80 && 
field.at(6)==76 && 
field.at(7)==69
) {
return org.nvd.json.jsoniter.reduced.CvssV20.AuthenticationType.MULTIPLE;
}
break;

}
throw iter.reportError("decode enum", field + " is not valid enum for org.nvd.json.jsoniter.reduced.CvssV20.AuthenticationType");
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
