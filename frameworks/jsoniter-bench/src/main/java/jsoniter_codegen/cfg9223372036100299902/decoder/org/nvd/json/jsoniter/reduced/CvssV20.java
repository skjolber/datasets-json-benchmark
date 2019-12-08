package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class CvssV20 implements com.jsoniter.spi.Decoder {
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
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.CvssV20() : (org.nvd.json.jsoniter.reduced.CvssV20)existingObj);
} else {
nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
if (nextToken == '}') {
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.CvssV20() : (org.nvd.json.jsoniter.reduced.CvssV20)existingObj);
} else {
com.jsoniter.CodegenAccess.unreadByte(iter);
}
} // end of if end
} else { com.jsoniter.CodegenAccess.unreadByte(iter); }// end of if not quote
org.nvd.json.jsoniter.reduced.CvssV20.AccessVectorType _accessVector_ = null;
org.nvd.json.jsoniter.reduced.CvssV20.AccessComplexityType _accessComplexity_ = null;
org.nvd.json.jsoniter.reduced.CvssV20.AuthenticationType _authentication_ = null;
org.nvd.json.jsoniter.reduced.CvssV20.CiaType _confidentialityImpact_ = null;
org.nvd.json.jsoniter.reduced.CvssV20.CiaType _integrityImpact_ = null;
org.nvd.json.jsoniter.reduced.CvssV20.CiaType _availabilityImpact_ = null;
java.lang.Double _baseScore_ = null;
do {
switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
case -1865109142: 
_baseScore_ = (java.lang.Double)(iter.readNull() ? null : java.lang.Double.valueOf(iter.readDouble()));
continue;
case -1694823839: 
_authentication_ = (org.nvd.json.jsoniter.reduced.CvssV20.AuthenticationType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV20_AuthenticationType.decode_(iter);
continue;
case -1674075637: 
_confidentialityImpact_ = (org.nvd.json.jsoniter.reduced.CvssV20.CiaType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV20_CiaType.decode_(iter);
continue;
case 491291423: 
_accessComplexity_ = (org.nvd.json.jsoniter.reduced.CvssV20.AccessComplexityType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV20_AccessComplexityType.decode_(iter);
continue;
case 817440120: 
_accessVector_ = (org.nvd.json.jsoniter.reduced.CvssV20.AccessVectorType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV20_AccessVectorType.decode_(iter);
continue;
case 1054083324: 
_availabilityImpact_ = (org.nvd.json.jsoniter.reduced.CvssV20.CiaType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV20_CiaType.decode_(iter);
continue;
case 1621758190: 
_integrityImpact_ = (org.nvd.json.jsoniter.reduced.CvssV20.CiaType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV20_CiaType.decode_(iter);
continue;
}
iter.skip();
} while (com.jsoniter.CodegenAccess.nextTokenIsComma(iter));
org.nvd.json.jsoniter.reduced.CvssV20 obj = (existingObj == null ? new org.nvd.json.jsoniter.reduced.CvssV20() : (org.nvd.json.jsoniter.reduced.CvssV20)existingObj);
obj.setAccessVector(_accessVector_);
obj.setAccessComplexity(_accessComplexity_);
obj.setAuthentication(_authentication_);
obj.setConfidentialityImpact(_confidentialityImpact_);
obj.setIntegrityImpact(_integrityImpact_);
obj.setAvailabilityImpact(_availabilityImpact_);
obj.setBaseScore(_baseScore_);
return obj;
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
