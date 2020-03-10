package com.github.skjolber.ecosystem;

public class AhoFunctionRunner {

	public static final void main(String[] args) {
		AhoFunction ahoFunction = new AhoFunction();
		
		
		String description = "Multiple stack-based buffer overflows in the CertDecoder::GetName function in src/asn.cpp in TaoCrypt in yaSSL before 1.9.9, as used in mysqld in MySQL 5.0.x before 5.0.90, MySQL 5.1.x before 5.1.43, MySQL 5.5.x through 5.5.0-m2, and other products, allow remote attackers to execute arbitrary code or cause a denial of service (memory corruption and daemon crash) by establishing an SSL connection and sending an X.509 client certificate with a crafted name field, as demonstrated by mysql_overflow1.py and the vd_mysql5 module in VulnDisco Pack Professional 8.11. NOTE: this was originally reported for MySQL 5.0.51a.";
		String result = ahoFunction.apply(description);
		
		System.out.println(result);
	}
}
