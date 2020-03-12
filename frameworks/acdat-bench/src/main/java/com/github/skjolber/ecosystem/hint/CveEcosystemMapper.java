package com.github.skjolber.ecosystem.hint;

import java.util.function.Function;

import org.nvd.json.jackson.DefCveItem;

import com.github.skjolber.ecosystem.hint.description.DescriptionEcosystemMapper;
import com.github.skjolber.ecosystem.hint.url.UrlEcosystemMapper;


/**
 * 
 * Utility for mapping CVEs to their ecosystems.
 * <br><br>
 * Follows a best effort approach: 
 * <ul>
 *     <li>scans through the description for known keywords or file extentions; alternatively </li>
 *     <li>attempts looks at the reference-data URLs for known hosts or path / query strings.</li>
 * </ul>
 * This class is not thread safe and must be instantiated on a per-thread basis.
 * 
 */

public class CveEcosystemMapper implements Function<DefCveItem, String> {

	private final DescriptionEcosystemMapper descriptionEcosystemMapper = new DescriptionEcosystemMapper();
	
	private final UrlEcosystemMapper urlEcosystemMapper = new UrlEcosystemMapper();

	/**
	 * 
	 * Map an CVE item to an ecosystem.
	 * 
	 * @param cve the item to map. Assumes a single, English description string.<br><br>
	 * @return the identified ecosystem, or null.
	 */
	
	@Override
	public String apply(DefCveItem cve) {
		String ecosystem = descriptionEcosystemMapper.apply(cve);
		if(ecosystem != null) {
			return ecosystem;
		}
		return urlEcosystemMapper.apply(cve);
	}
	
}
