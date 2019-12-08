package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class CVEDataMeta implements com.jsoniter.spi.Decoder {
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
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.CVEDataMeta() : (org.nvd.json.jsoniter.reduced.CVEDataMeta)existingObj);
} else {
nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
if (nextToken == '}') {
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.CVEDataMeta() : (org.nvd.json.jsoniter.reduced.CVEDataMeta)existingObj);
} else {
com.jsoniter.CodegenAccess.unreadByte(iter);
}
} // end of if end
} else { com.jsoniter.CodegenAccess.unreadByte(iter); }// end of if not quote
java.lang.String _id_ = null;
do {
switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
case 1458105184: 
_id_ = (java.lang.String)iter.readString();
continue;
}
iter.skip();
} while (com.jsoniter.CodegenAccess.nextTokenIsComma(iter));
org.nvd.json.jsoniter.reduced.CVEDataMeta obj = (existingObj == null ? new org.nvd.json.jsoniter.reduced.CVEDataMeta() : (org.nvd.json.jsoniter.reduced.CVEDataMeta)existingObj);
obj.setId(_id_);
return obj;
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
