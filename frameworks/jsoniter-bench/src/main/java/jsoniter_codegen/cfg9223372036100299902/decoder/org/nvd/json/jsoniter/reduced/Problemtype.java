package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class Problemtype implements com.jsoniter.spi.Decoder {
public static java.lang.Object decode_(com.jsoniter.JsonIterator iter) throws java.io.IOException { java.lang.Object existingObj = com.jsoniter.CodegenAccess.resetExistingObject(iter);
byte nextToken = com.jsoniter.CodegenAccess.readByte(iter);
if (nextToken != '{') {
if (nextToken == 'n') {
com.jsoniter.CodegenAccess.skipFixedBytes(iter, 3);
return null;
} else {
nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
if (nextToken == 'n') {
com.jsoniter.CodegenAccess.skipFixedBytes(iter, 3);
return null;
}
} // end of if null
} // end of if {
nextToken = com.jsoniter.CodegenAccess.readByte(iter);
if (nextToken != '"') {
if (nextToken == '}') {
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.Problemtype() : (org.nvd.json.jsoniter.reduced.Problemtype)existingObj);
} else {
nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
if (nextToken == '}') {
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.Problemtype() : (org.nvd.json.jsoniter.reduced.Problemtype)existingObj);
} else {
com.jsoniter.CodegenAccess.unreadByte(iter);
}
} // end of if end
} else { com.jsoniter.CodegenAccess.unreadByte(iter); }// end of if not quote
java.util.List _problemtypeData_ = null;
do {
switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
case -179786943: 
_problemtypeData_ = (java.util.List)jsoniter_codegen.cfg9223372036100299902.decoder.java.util.List_org.nvd.json.jsoniter.reduced.ProblemtypeDatum.decode_(iter);
continue;
}
iter.skip();
} while (com.jsoniter.CodegenAccess.nextTokenIsComma(iter));
org.nvd.json.jsoniter.reduced.Problemtype obj = (existingObj == null ? new org.nvd.json.jsoniter.reduced.Problemtype() : (org.nvd.json.jsoniter.reduced.Problemtype)existingObj);
obj.setProblemtypeData(_problemtypeData_);
return obj;
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
