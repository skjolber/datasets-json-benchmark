package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class DefCpeMatch implements com.jsoniter.spi.Decoder {
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
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.DefCpeMatch() : (org.nvd.json.jsoniter.reduced.DefCpeMatch)existingObj);
} else {
nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
if (nextToken == '}') {
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.DefCpeMatch() : (org.nvd.json.jsoniter.reduced.DefCpeMatch)existingObj);
} else {
com.jsoniter.CodegenAccess.unreadByte(iter);
}
} // end of if end
} else { com.jsoniter.CodegenAccess.unreadByte(iter); }// end of if not quote
java.lang.Boolean _vulnerable_ = null;
java.lang.String _cpe22Uri_ = null;
java.lang.String _cpe23Uri_ = null;
java.lang.String _versionStartExcluding_ = null;
java.lang.String _versionStartIncluding_ = null;
java.lang.String _versionEndExcluding_ = null;
java.lang.String _versionEndIncluding_ = null;
do {
switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
case -2046016781: 
_versionEndIncluding_ = (java.lang.String)iter.readString();
continue;
case -282091019: 
_vulnerable_ = (java.lang.Boolean)(iter.readNull() ? null : java.lang.Boolean.valueOf(iter.readBoolean()));
continue;
case 262599481: 
_versionEndExcluding_ = (java.lang.String)iter.readString();
continue;
case 563761009: 
_cpe22Uri_ = (java.lang.String)iter.readString();
continue;
case 1571471336: 
_versionStartIncluding_ = (java.lang.String)iter.readString();
continue;
case 1885331842: 
_versionStartExcluding_ = (java.lang.String)iter.readString();
continue;
case 1926960280: 
_cpe23Uri_ = (java.lang.String)iter.readString();
continue;
}
iter.skip();
} while (com.jsoniter.CodegenAccess.nextTokenIsComma(iter));
org.nvd.json.jsoniter.reduced.DefCpeMatch obj = (existingObj == null ? new org.nvd.json.jsoniter.reduced.DefCpeMatch() : (org.nvd.json.jsoniter.reduced.DefCpeMatch)existingObj);
obj.setVulnerable(_vulnerable_);
obj.setCpe22Uri(_cpe22Uri_);
obj.setCpe23Uri(_cpe23Uri_);
obj.setVersionStartExcluding(_versionStartExcluding_);
obj.setVersionStartIncluding(_versionStartIncluding_);
obj.setVersionEndExcluding(_versionEndExcluding_);
obj.setVersionEndIncluding(_versionEndIncluding_);
return obj;
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
