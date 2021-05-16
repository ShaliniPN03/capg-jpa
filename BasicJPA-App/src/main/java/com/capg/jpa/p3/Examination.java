package com.capg.jpa.p3;

import java.util.Comparator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Examination implements Comparator<Examination>{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int CourseID;
	private String courseName;
	private int marks;
	private int duration;
	
	public Examination() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Examination(String courseName, int marks, int duration) {
		super();
		
		this.courseName = courseName;
		this.marks = marks;
		this.duration = duration;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CourseID;
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + duration;
		result = prime * result + marks;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Examination other = (Examination) obj;
		if (CourseID != other.CourseID)
			return false;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (duration != other.duration)
			return false;
		if (marks != other.marks)
			return false;
		return true;
	}

	public int compare(Examination o1, Examination o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*@Override
	public int compare(Examination o1, Examination o2) {
		// TODO Auto-generated method stub
		return 0;
	}*/

	

	
	
	
	
	
	
}