package com.github.skjolber.ecosystem;

import com.github.skjolber.ecosystem.typed.BaseEcosystemMapper;

public class AhoFunctionRunner {

	public static final void main(String[] args) {
		BaseEcosystemMapper ahoFunction = new BaseEcosystemMapper();
		
		
		String description = "Unspecified vulnerability in the Java Runtime Environment (JRE) component in Oracle Java SE 7 Update 2 and earlier, and 6 Update 30 and earlier, allows remote attackers to affect confidentiality, integrity, and availability via unknown vectors related to 2D. Per: http://www.oracle.com/technetwork/topics/security/javacpufeb2012-366318.html'Applies to client and server deployments of Java. This vulnerability can be exploited through Untrusted Java Web Start applications and Untrusted Java applets. It can also be exploited by supplying data to APIs in the specified Component without using untrusted Java Web Start applications or untrusted Java applets, such as through a web service.'";
		String result = ahoFunction.apply(description);
		
		System.out.println(result);
	}
}
