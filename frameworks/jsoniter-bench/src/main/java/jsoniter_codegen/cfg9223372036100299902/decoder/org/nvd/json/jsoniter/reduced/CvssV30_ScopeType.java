package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class CvssV30_ScopeType implements com.jsoniter.spi.Decoder {
public static java.lang.Object decode_(com.jsoniter.JsonIterator iter) throws java.io.IOException { if (iter.readNull()) { return null; }
com.jsoniter.spi.Slice field = com.jsoniter.CodegenAccess.readSlice(iter);
switch (field.len()) {
case 7: 
if (
field.at(0)==67 && 
field.at(1)==72 && 
field.at(2)==65 && 
field.at(3)==78 && 
field.at(4)==71 && 
field.at(5)==69 && 
field.at(6)==68
) {
return org.nvd.json.jsoniter.reduced.CvssV30.ScopeType.CHANGED;
}
break;
case 9: 
if (
field.at(0)==85 && 
field.at(1)==78 && 
field.at(2)==67 && 
field.at(3)==72 && 
field.at(4)==65 && 
field.at(5)==78 && 
field.at(6)==71 && 
field.at(7)==69 && 
field.at(8)==68
) {
return org.nvd.json.jsoniter.reduced.CvssV30.ScopeType.UNCHANGED;
}
break;

}
throw iter.reportError("decode enum", field + " is not valid enum for org.nvd.json.jsoniter.reduced.CvssV30.ScopeType");
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
