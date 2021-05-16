package com.capg.jpa.p3;

import java.time.LocalDate;

import javax.persistence.Entity;

import org.springframework.cglib.core.Local;

@Entity
public class External extends Examination {
	
	
	private LocalDate labDate;
	private int marksObrained;
	public External() {
		super();
		// TODO Auto-generated constructor stub
	}
	public External(String courseName, int marks, int duration, LocalDate labDate,int marksObrained) {
		super(courseName, marks, duration);
		
		this.labDate = labDate;
		this.marksObrained=marksObrained;
	}
	
	public LocalDate getLabDate() {
		return labDate;
	}
	public void setLabDate(LocalDate labDate) {
		this.labDate = labDate;
	}
	public int getMarksObrained() {
		return marksObrained;
	}
	public void setMarksObrained(int marksObrained) {
		this.marksObrained = marksObrained;
	}
	
	
	
	
	

}
