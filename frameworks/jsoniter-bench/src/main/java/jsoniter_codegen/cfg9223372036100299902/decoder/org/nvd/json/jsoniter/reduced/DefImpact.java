package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class DefImpact implements com.jsoniter.spi.Decoder {
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
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.DefImpact() : (org.nvd.json.jsoniter.reduced.DefImpact)existingObj);
} else {
nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
if (nextToken == '}') {
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.DefImpact() : (org.nvd.json.jsoniter.reduced.DefImpact)existingObj);
} else {
com.jsoniter.CodegenAccess.unreadByte(iter);
}
} // end of if end
} else { com.jsoniter.CodegenAccess.unreadByte(iter); }// end of if not quote
org.nvd.json.jsoniter.reduced.BaseMetricV3 _baseMetricV3_ = null;
org.nvd.json.jsoniter.reduced.BaseMetricV2 _baseMetricV2_ = null;
do {
switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
case -2142785884: 
_baseMetricV2_ = (org.nvd.json.jsoniter.reduced.BaseMetricV2)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.BaseMetricV2.decode_(iter);
continue;
case -2126008265: 
_baseMetricV3_ = (org.nvd.json.jsoniter.reduced.BaseMetricV3)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.BaseMetricV3.decode_(iter);
continue;
}
iter.skip();
} while (com.jsoniter.CodegenAccess.nextTokenIsComma(iter));
org.nvd.json.jsoniter.reduced.DefImpact obj = (existingObj == null ? new org.nvd.json.jsoniter.reduced.DefImpact() : (org.nvd.json.jsoniter.reduced.DefImpact)existingObj);
obj.setBaseMetricV3(_baseMetricV3_);
obj.setBaseMetricV2(_baseMetricV2_);
return obj;
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
