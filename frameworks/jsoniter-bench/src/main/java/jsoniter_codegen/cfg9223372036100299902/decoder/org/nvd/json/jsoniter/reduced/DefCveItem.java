package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class DefCveItem implements com.jsoniter.spi.Decoder {
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
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.DefCveItem() : (org.nvd.json.jsoniter.reduced.DefCveItem)existingObj);
} else {
nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
if (nextToken == '}') {
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.DefCveItem() : (org.nvd.json.jsoniter.reduced.DefCveItem)existingObj);
} else {
com.jsoniter.CodegenAccess.unreadByte(iter);
}
} // end of if end
} else { com.jsoniter.CodegenAccess.unreadByte(iter); }// end of if not quote
org.nvd.json.jsoniter.reduced.CVEJSON40Min _cve_ = null;
org.nvd.json.jsoniter.reduced.DefImpact _impact_ = null;
org.nvd.json.jsoniter.reduced.DefConfigurations _configurations_ = null;
do {
switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
case -179343253: 
_cve_ = (org.nvd.json.jsoniter.reduced.CVEJSON40Min)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CVEJSON40Min.decode_(iter);
continue;
case 510767767: 
_impact_ = (org.nvd.json.jsoniter.reduced.DefImpact)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.DefImpact.decode_(iter);
continue;
case 877441790: 
_configurations_ = (org.nvd.json.jsoniter.reduced.DefConfigurations)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.DefConfigurations.decode_(iter);
continue;
}
iter.skip();
} while (com.jsoniter.CodegenAccess.nextTokenIsComma(iter));
org.nvd.json.jsoniter.reduced.DefCveItem obj = (existingObj == null ? new org.nvd.json.jsoniter.reduced.DefCveItem() : (org.nvd.json.jsoniter.reduced.DefCveItem)existingObj);
obj.setCve(_cve_);
obj.setImpact(_impact_);
obj.setConfigurations(_configurations_);
return obj;
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
