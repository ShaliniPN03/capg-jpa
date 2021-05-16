package com.capg.jpa.p2;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Scholarship {
	@Id
	private int applicationNumber;
	private String name;
	private int amount;
	private LocalDate appliedDate;
	
	
	@OneToOne(mappedBy = "scholarship")
	private Student student;
	
	public Scholarship() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Scholarship(int applicationNumber, String name, int amount, LocalDate appliedDate) {
		super();
		this.applicationNumber = applicationNumber;
		this.name = name;
		this.amount = amount;
		this.appliedDate = appliedDate;
	}

	public int getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(int applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public LocalDate getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(LocalDate appliedDate) {
		this.appliedDate = appliedDate;
	}
	
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Scholarship [applicationNumber=" + applicationNumber + ", name=" + name + ", amount=" + amount
				+ ", appliedDate=" + appliedDate+"]";
	}

	
	
	

}