package jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced;
public class CvssV30 implements com.jsoniter.spi.Decoder {
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
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.CvssV30() : (org.nvd.json.jsoniter.reduced.CvssV30)existingObj);
} else {
nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
if (nextToken == '}') {
return (existingObj == null ? new org.nvd.json.jsoniter.reduced.CvssV30() : (org.nvd.json.jsoniter.reduced.CvssV30)existingObj);
} else {
com.jsoniter.CodegenAccess.unreadByte(iter);
}
} // end of if end
} else { com.jsoniter.CodegenAccess.unreadByte(iter); }// end of if not quote
org.nvd.json.jsoniter.reduced.CvssV30.CiaType _confidentialityImpact_ = null;
org.nvd.json.jsoniter.reduced.CvssV30.CiaType _integrityImpact_ = null;
org.nvd.json.jsoniter.reduced.CvssV30.CiaType _availabilityImpact_ = null;
java.lang.Double _baseScore_ = null;
org.nvd.json.jsoniter.reduced.CvssV30.AttackVectorType _attackVector_ = null;
org.nvd.json.jsoniter.reduced.CvssV30.AttackComplexityType _attackComplexity_ = null;
org.nvd.json.jsoniter.reduced.CvssV30.PrivilegesRequiredType _privilegesRequired_ = null;
org.nvd.json.jsoniter.reduced.CvssV30.UserInteractionType _userInteraction_ = null;
org.nvd.json.jsoniter.reduced.CvssV30.ScopeType _scope_ = null;
org.nvd.json.jsoniter.reduced.CvssV30.SeverityType _baseSeverity_ = null;
do {
switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
case -1865109142: 
_baseScore_ = (java.lang.Double)(iter.readNull() ? null : java.lang.Double.valueOf(iter.readDouble()));
continue;
case -1674075637: 
_confidentialityImpact_ = (org.nvd.json.jsoniter.reduced.CvssV30.CiaType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV30_CiaType.decode_(iter);
continue;
case -1104481301: 
_scope_ = (org.nvd.json.jsoniter.reduced.CvssV30.ScopeType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV30_ScopeType.decode_(iter);
continue;
case -906359406: 
_userInteraction_ = (org.nvd.json.jsoniter.reduced.CvssV30.UserInteractionType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV30_UserInteractionType.decode_(iter);
continue;
case -160846879: 
_attackComplexity_ = (org.nvd.json.jsoniter.reduced.CvssV30.AttackComplexityType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV30_AttackComplexityType.decode_(iter);
continue;
case 936624266: 
_attackVector_ = (org.nvd.json.jsoniter.reduced.CvssV30.AttackVectorType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV30_AttackVectorType.decode_(iter);
continue;
case 1054083324: 
_availabilityImpact_ = (org.nvd.json.jsoniter.reduced.CvssV30.CiaType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV30_CiaType.decode_(iter);
continue;
case 1150847096: 
_privilegesRequired_ = (org.nvd.json.jsoniter.reduced.CvssV30.PrivilegesRequiredType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV30_PrivilegesRequiredType.decode_(iter);
continue;
case 1621758190: 
_integrityImpact_ = (org.nvd.json.jsoniter.reduced.CvssV30.CiaType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV30_CiaType.decode_(iter);
continue;
case 1623797567: 
_baseSeverity_ = (org.nvd.json.jsoniter.reduced.CvssV30.SeverityType)jsoniter_codegen.cfg9223372036100299902.decoder.org.nvd.json.jsoniter.reduced.CvssV30_SeverityType.decode_(iter);
continue;
}
iter.skip();
} while (com.jsoniter.CodegenAccess.nextTokenIsComma(iter));
org.nvd.json.jsoniter.reduced.CvssV30 obj = (existingObj == null ? new org.nvd.json.jsoniter.reduced.CvssV30() : (org.nvd.json.jsoniter.reduced.CvssV30)existingObj);
obj.setConfidentialityImpact(_confidentialityImpact_);
obj.setIntegrityImpact(_integrityImpact_);
obj.setAvailabilityImpact(_availabilityImpact_);
obj.setBaseScore(_baseScore_);
obj.setAttackVector(_attackVector_);
obj.setAttackComplexity(_attackComplexity_);
obj.setPrivilegesRequired(_privilegesRequired_);
obj.setUserInteraction(_userInteraction_);
obj.setScope(_scope_);
obj.setBaseSeverity(_baseSeverity_);
return obj;
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
