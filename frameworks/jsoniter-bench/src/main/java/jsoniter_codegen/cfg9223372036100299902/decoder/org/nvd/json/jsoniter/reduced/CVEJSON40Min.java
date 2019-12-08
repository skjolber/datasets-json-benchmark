package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class CVEJSON40Min implements com.jsoniter.spi.Decoder {
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
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.CVEJSON40Min() : (org.nvd.json.jsoniter.reduced.CVEJSON40Min)existingObj);
} else {
nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
if (nextToken == '}') {
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.CVEJSON40Min() : (org.nvd.json.jsoniter.reduced.CVEJSON40Min)existingObj);
} else {
com.jsoniter.CodegenAccess.unreadByte(iter);
}
} // end of if end
} else { com.jsoniter.CodegenAccess.unreadByte(iter); }// end of if not quote
org.nvd.json.jsoniter.reduced.Description _description_ = null;
org.nvd.json.jsoniter.reduced.CVEDataMeta _cVEDataMeta_ = null;
org.nvd.json.jsoniter.reduced.Problemtype _problemtype_ = null;
org.nvd.json.jsoniter.reduced.References _references_ = null;
do {
switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
case -365621876: 
_cVEDataMeta_ = (org.nvd.json.jsoniter.reduced.CVEDataMeta)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CVEDataMeta.decode_(iter);
continue;
case -361818764: 
_problemtype_ = (org.nvd.json.jsoniter.reduced.Problemtype)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.Problemtype.decode_(iter);
continue;
case 879704937: 
_description_ = (org.nvd.json.jsoniter.reduced.Description)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.Description.decode_(iter);
continue;
case 1670576075: 
_references_ = (org.nvd.json.jsoniter.reduced.References)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.References.decode_(iter);
continue;
}
iter.skip();
} while (com.jsoniter.CodegenAccess.nextTokenIsComma(iter));
org.nvd.json.jsoniter.reduced.CVEJSON40Min obj = (existingObj == null ? new org.nvd.json.jsoniter.reduced.CVEJSON40Min() : (org.nvd.json.jsoniter.reduced.CVEJSON40Min)existingObj);
obj.setDescription(_description_);
obj.setCVEDataMeta(_cVEDataMeta_);
obj.setProblemtype(_problemtype_);
obj.setReferences(_references_);
return obj;
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
