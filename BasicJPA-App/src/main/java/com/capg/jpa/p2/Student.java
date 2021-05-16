package com.capg.jpa.p2;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity   
@Table(name = "Students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "rollNumber")
	private int id;
	@Column(name= "studentName")
	private String name;
	private int marks;
	private int age;

	
	@Embedded
	private Certificate certificate;
	
	@ElementCollection
	@CollectionTable(name="CourseInfo",joinColumns = @JoinColumn(name="rollNumber"))
	List<Course> courses;
	
/*	@AttributeOverrides({
		@AttributeOverride(name = "courseId", column = @Column(name="nonTechCourseId")),
		@AttributeOverride(name = "courseName", column = @Column(name="nonTechCourseName")),
		@AttributeOverride(name = "duration", column = @Column(name="nonTechCourseDuration")),
		@AttributeOverride(name = "instructorId", column = @Column(name="nonTechInstructorId"))
	})
	List<Course> nonTechCourses;
	*/

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ScholarshipId",referencedColumnName = "applicationNumber")
	private Scholarship scholarship;
	
	
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Student( String name, int marks, int age) {
		super();
		//this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
		
	}



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

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	
	

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

/*	public List<Course> getNonTechCourses() {
		return nonTechCourses;
	}
	public void setNonTechCourses(List<Course> nonTechCourses) {
		this.nonTechCourses = nonTechCourses;
	}
	*/
	public Scholarship getScholarship() {
		return scholarship;
	}



	public void setScholarship(Scholarship scholarship) {
		this.scholarship = scholarship;
	}


	

	


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + ", certificate="
				+ certificate + ", courses=" + courses + ", scholarship=" + scholarship + ", semCoursesList="
				+  "]";
	}



	
	
	



	



	

}