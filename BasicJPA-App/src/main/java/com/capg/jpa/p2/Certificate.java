package com.capg.jpa.p2;

import java.time.LocalDate;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	
	private String certificateName;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String certificateName) {
		super();
		this.certificateName = certificateName;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	@Override
	public String toString() {
		return "Certificate [certificateName=" + certificateName + "]";
	}
	
	

}
