package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class DefNode implements com.jsoniter.spi.Decoder {
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
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.DefNode() : (org.nvd.json.jsoniter.reduced.DefNode)existingObj);
} else {
nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
if (nextToken == '}') {
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.DefNode() : (org.nvd.json.jsoniter.reduced.DefNode)existingObj);
} else {
com.jsoniter.CodegenAccess.unreadByte(iter);
}
} // end of if end
} else { com.jsoniter.CodegenAccess.unreadByte(iter); }// end of if not quote
java.lang.String _operator_ = null;
java.util.List _children_ = null;
java.util.List _cpeMatch_ = null;
do {
switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
case -69931267: 
_operator_ = (java.lang.String)iter.readString();
continue;
case 1425484211: 
_cpeMatch_ = (java.util.List)jsoniter_codegen.cfg9223372036100299902.decoder.java.util.List_org.nvd.json.jsoniter.reduced.DefCpeMatch.decode_(iter);
continue;
case 1739180498: 
_children_ = (java.util.List)com.jsoniter.CodegenAccess.read("jsoniter_codegen.cfg9223372036100299902.decoder.java.util.List_org.nvd.json.jsoniter.reduced.DefNode", iter);
continue;
}
iter.skip();
} while (com.jsoniter.CodegenAccess.nextTokenIsComma(iter));
org.nvd.json.jsoniter.reduced.DefNode obj = (existingObj == null ? new org.nvd.json.jsoniter.reduced.DefNode() : (org.nvd.json.jsoniter.reduced.DefNode)existingObj);
obj.setOperator(_operator_);
obj.setChildren(_children_);
obj.setCpeMatch(_cpeMatch_);
return obj;
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
