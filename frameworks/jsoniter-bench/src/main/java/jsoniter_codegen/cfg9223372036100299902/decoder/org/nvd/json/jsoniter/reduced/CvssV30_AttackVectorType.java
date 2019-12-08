package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class CvssV30_AttackVectorType implements com.jsoniter.spi.Decoder {
public static java.lang.Object decode_(com.jsoniter.JsonIterator iter) throws java.io.IOException { if (iter.readNull()) { return null; }
com.jsoniter.spi.Slice field = com.jsoniter.CodegenAccess.readSlice(iter);
switch (field.len()) {
case 16: 
if (
field.at(0)==65 && 
field.at(1)==68 && 
field.at(2)==74 && 
field.at(3)==65 && 
field.at(4)==67 && 
field.at(5)==69 && 
field.at(6)==78 && 
field.at(7)==84 && 
field.at(8)==95 && 
field.at(9)==78 && 
field.at(10)==69 && 
field.at(11)==84 && 
field.at(12)==87 && 
field.at(13)==79 && 
field.at(14)==82 && 
field.at(15)==75
) {
return org.nvd.json.jsoniter.reduced.CvssV30.AttackVectorType.ADJACENT_NETWORK;
}
break;
case 5: 
if (
field.at(0)==76 && 
field.at(1)==79 && 
field.at(2)==67 && 
field.at(3)==65 && 
field.at(4)==76
) {
return org.nvd.json.jsoniter.reduced.CvssV30.AttackVectorType.LOCAL;
}
break;
case 7: 
if (
field.at(0)==78 && 
field.at(1)==69 && 
field.at(2)==84 && 
field.at(3)==87 && 
field.at(4)==79 && 
field.at(5)==82 && 
field.at(6)==75
) {
return org.nvd.json.jsoniter.reduced.CvssV30.AttackVectorType.NETWORK;
}
break;
case 8: 
if (
field.at(0)==80 && 
field.at(1)==72 && 
field.at(2)==89 && 
field.at(3)==83 && 
field.at(4)==73 && 
field.at(5)==67 && 
field.at(6)==65 && 
field.at(7)==76
) {
return org.nvd.json.jsoniter.reduced.CvssV30.AttackVectorType.PHYSICAL;
}
break;

}
throw iter.reportError("decode enum", field + " is not valid enum for org.nvd.json.jsoniter.reduced.CvssV30.AttackVectorType");
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
