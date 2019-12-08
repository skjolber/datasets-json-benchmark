package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class BaseMetricV2 implements com.jsoniter.spi.Decoder {
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
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.BaseMetricV2() : (org.nvd.json.jsoniter.reduced.BaseMetricV2)existingObj);
} else {
nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
if (nextToken == '}') {
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.BaseMetricV2() : (org.nvd.json.jsoniter.reduced.BaseMetricV2)existingObj);
} else {
com.jsoniter.CodegenAccess.unreadByte(iter);
}
} // end of if end
} else { com.jsoniter.CodegenAccess.unreadByte(iter); }// end of if not quote
org.nvd.json.jsoniter.reduced.CvssV20 _cvssV2_ = null;
java.lang.String _severity_ = null;
do {
switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
case -1879289934: 
_severity_ = (java.lang.String)iter.readString();
continue;
case 1491332578: 
_cvssV2_ = (org.nvd.json.jsoniter.reduced.CvssV20)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV20.decode_(iter);
continue;
}
iter.skip();
} while (com.jsoniter.CodegenAccess.nextTokenIsComma(iter));
org.nvd.json.jsoniter.reduced.BaseMetricV2 obj = (existingObj == null ? new org.nvd.json.jsoniter.reduced.BaseMetricV2() : (org.nvd.json.jsoniter.reduced.BaseMetricV2)existingObj);
obj.setCvssV2(_cvssV2_);
obj.setSeverity(_severity_);
return obj;
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
