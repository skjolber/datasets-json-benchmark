package com.github.skjolber.ecosystem;

import org.owasp.dependencycheck.data.nvd.ecosystem.DescriptionEcosystemMapper;
import org.owasp.dependencycheck.data.nvd.json.CVEJSON40Min11;
import org.owasp.dependencycheck.data.nvd.json.DefCveItem;
import org.owasp.dependencycheck.data.nvd.json.Description;
import org.owasp.dependencycheck.data.nvd.json.LangString;

public class DescriptionEcosystemMapperRunner {

	public static final void main(String[] args) {
		DescriptionEcosystemMapper ahoFunction = new DescriptionEcosystemMapper();
		
		String description = "Integer overflow in the JPEGImageReader implementation in the ImageI/O component in Sun Java SE in JDK and JRE 5.0 before Update 22, JDK and JRE 6 before Update 17, and SDK and JRE 1.4.x before 1.4.2_24 allows remote attackers to execute arbitrary code via large subsample dimensions in a JPEG file that triggers a heap-based buffer overflow, aka Bug Id 6874643. Per: http://sunsolve.sun.com/search/document.do?assetkey=1-66-270474-1ResolutionCR 6854303, 6862970, 6872357, 6872358, and 6862969 are addressed in the following releases:Java SE for Windows, Solaris, and Linux:    * JDK and JRE 6 Update 17 or later    * JDK and JRE 5.0 Update 22 or laterJava SE for Solaris:    * SDK and JRE 1.4.2_24 or laterJava SE for Windows:    * SDK and JRE 1.3.1_27 or laterJava SE for Business for Windows, Solaris and Linux:    * JDK and JRE 6 Update 17 or later    * JDK and JRE 5.0 Update 22 or later    * SDK and JRE 1.4.2_24 or laterThe issues described in CR 6874643 and 6862968 are addressed in the following releases:Java SE for Windows, Solaris, and Linux:    * JDK and JRE 6 Update 17 or later    * JDK and JRE 5.0 Update 22 or laterJava SE for Solaris:    * SDK and JRE 1.4.2_24 or laterJava SE for Business for Windows, Solaris and Linux:    * JDK and JRE 6 Update 17 or later    * JDK and JRE 5.0 Update 22 or later    * SDK and JRE 1.4.2_24 or laterJava SE releases are available at:JDK and JRE 6 Update 17:    * http://java.sun.com/javase/downloads/index.jspJRE 6 Update 17:    * http://java.com/    * Through the Java Update tool for Microsoft Windows usersJDK 6 Update 17 for Solaris is available in the following patches:    * Java SE 6: update 17 (as delivered in patch 125136-18)    * Java SE 6: update 17 (as delivered in patch 125137-18 (64bit))    * Java SE 6_x86: update 17 (as delivered in patch 125138-18)    * Java SE 6_x86: update 17 (as delivered in patch 125139-18 (64bit))JDK and JRE 5.0 Update 22:    * http://java.sun.com/javase/downloads/index_jdk5.jspJDK 5.0 Update 22 for Solaris is available in the following patches:    * J2SE 5.0: update 22 (as delivered in patch 118666-24)    * J2SE 5.0: update 22 (as delivered in patch 118667-24 (64bit))    * J2SE 5.0_x86: update 22 (as delivered in patch 118668-24)    * J2SE 5.0_x86: update 22 (as delivered in patch 118669-24 (64bit))Java SE for Business releases are available at:    * http://www.sun.com/software/javaseforbusiness/getit_download.jsp.'";
		String result = ahoFunction.getEcosystem(asCve(description));
		
		System.out.println(result);
	}
	
    private static DefCveItem asCve(String description) {
        DefCveItem defCveItem = new DefCveItem();
        
        Description d = new Description();
        
        LangString string = new LangString();
        string.setLang("en");
        string.setValue(description);
        
        d.getDescriptionData().add(string);
        
        CVEJSON40Min11 cve = new CVEJSON40Min11();
        cve.setDescription(d);
        
        defCveItem.setCve(cve);
        
        return defCveItem;
    }
}
