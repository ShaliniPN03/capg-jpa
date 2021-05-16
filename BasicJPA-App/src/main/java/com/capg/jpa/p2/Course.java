package com.capg.jpa.p2;

import javax.persistence.Embeddable;

@Embeddable
public class Course {
	
	private String courseName;
	private int duration;
	private int instructorId;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course( String courseName, int duration, int instructorId) {
		super();
		
		this.courseName = courseName;
		this.duration = duration;
		this.instructorId = instructorId;
	}

	
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", duration=" + duration + ", instructorId=" + instructorId + "]";
	}
	
	
	

}