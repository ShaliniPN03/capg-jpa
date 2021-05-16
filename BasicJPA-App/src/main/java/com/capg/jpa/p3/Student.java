package com.capg.jpa.p3;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "NHCEStudent")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "StudentRollNo")
	private int id;
	
	@Column(name = "StudentName")
	private String name;
	
	private int marks;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int marks, int age) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "Course_Student",
			joinColumns = @JoinColumn(name="Student_ID"),
			inverseJoinColumns = @JoinColumn(name = "Course"))
	private List<Course>listedCourses;
	
	@Embedded
	private Certificate cetificate;
	
	@ElementCollection
	@CollectionTable(name="CourseInfo",joinColumns = @JoinColumn(name="StudentRollNo"))
	List<Course> courses;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	public Certificate getCetificate() {
		return cetificate;
	}
	public void setCetificate(Certificate cetificate) {
		this.cetificate = cetificate;
	}
	
	
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
	
	public List<Course> getListedApps() {
		return listedCourses;
	}
	public void setListedApps(List<Course> listedCourses) {
		this.listedCourses = listedCourses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + ", cetificate="
				+ cetificate + ", courses=" + courses + "]";
	}
}