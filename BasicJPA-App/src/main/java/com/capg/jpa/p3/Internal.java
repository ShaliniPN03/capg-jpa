package com.capg.jpa.p3;

import javax.persistence.Entity;

@Entity
public class Internal extends Examination {
	
	private int noOfChapters;
	private int marksObtained;

	public Internal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Internal( String courseName, int marks, int duration,int noOfChapters,int marksObtained) {
		super( courseName, marks, duration);
		this.noOfChapters=noOfChapters;
		this.marksObtained = marksObtained;
		
	}

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}
}
	
	

	
	

	

	
	
	
	

