package com.capg.jpa.p3;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {

    @Id
    private String courseName;
    private String courseStream;

    public Course() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Course(String courseName, String courseStream) {
        super();
        this.courseName = courseName;
        this.courseStream = courseStream;
    }

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name="Course_Student",
            joinColumns=@JoinColumn(name="Course"),
            inverseJoinColumns=@JoinColumn(name="Student_ID"))
    private List<Student> studentList;


    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseStream() {
        return courseStream;
    }
    public void setCourseStream(String courseStream) {
        this.courseStream = courseStream;
    }



    public List<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", courseStream=" + courseStream + "]";
    }
}