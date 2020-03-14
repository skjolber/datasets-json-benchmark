package com.github.skjolber.ecosystem;

public class DescriptionEcosystemMapper extends org.owasp.dependencycheck.data.nvd.ecosystem.DescriptionEcosystemMapper {
	public String getEcosystem(String multicase) {
		search(multicase);

		return getResult();
	}
};
