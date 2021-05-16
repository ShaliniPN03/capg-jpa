package com.capg.jpa.p3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class StudentMainClass {

public static void main(String[] args) {
	
	StudentMainClass obj = new StudentMainClass();
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		
		Session session = factory.openSession();// jdbc -> coonection object
		
		
		
		Course course1 = obj.getCourse();  
		Course course2 = obj.getCourse();  
		Course course3 = obj.getCourse();  
		
		Student student1 = obj.getStudent(); 
		Student student2 = obj.getStudent(); 
		Student student3 = obj.getStudent();  
		Student student4 = obj.getStudent(); 
		Student student5 = obj.getStudent(); 
		
		
		
		
		List<Student> studentListfor_course1 = new ArrayList<Student>();
		studentListfor_course1.add(student1);
		studentListfor_course1.add(student2);
		studentListfor_course1.add(student3);
		studentListfor_course1.add(student4);
		studentListfor_course1.add(student5);
		
		List<Student> studentListfor_course2 = new ArrayList<Student>();
		studentListfor_course2.add(student1);
		studentListfor_course2.add(student2);
		studentListfor_course2.add(student4);
		
		List<Student> studentListfor_course3 = new ArrayList<Student>();
		studentListfor_course3.add(student2);
		studentListfor_course3.add(student4);
		
		
		
		
		
		List<Course> appListFor_student1 = new ArrayList<Course>();
		appListFor_student1.add(course1);
		appListFor_student1.add(course2);
		
		List<Course> appListFor_student2 = new ArrayList<Course>();
		appListFor_student2.add(course1);
		appListFor_student2.add(course2);
		appListFor_student2.add(course3);
		
		List<Course> appListFor_student3 = new ArrayList<Course>();
		appListFor_student3.add(course1);
		
		List<Course> appListFor_student4 = new ArrayList<Course>();
		appListFor_student4.add(course1);
		appListFor_student4.add(course2);
		appListFor_student4.add(course3);
		
		List<Course> appListFor_student5 = new ArrayList<Course>();
		appListFor_student5.add(course1);
		
		
		 
		
		course1.setStudentList(studentListfor_course1);
		course2.setStudentList(studentListfor_course2);
		course3.setStudentList(studentListfor_course3);
				
		// ------------ Adding Collection of App to Hotel ----- 
				
		student1.setListedApps(appListFor_student1);
		student2.setListedApps(appListFor_student2);
		student3.setListedApps(appListFor_student3);
		student4.setListedApps(appListFor_student4);
		student5.setListedApps(appListFor_student5);
		
			
				
		Transaction t = session.beginTransaction();
		
		
		session.save(course1);
		session.save(course2);
		session.save(course3);
		
		session.save(student1);
		session.save(student2);
		session.save(student3);
		session.save(student4);
		session.save(student5);
		
		
		t.commit();
		
		System.out.println(" Data Saved");
		
		
		
		
		
		
		
		
	}
	
	public Course getCourse()
	{
		Course course = new Course();
		System.out.println("Enter Course Name ");
		course.setCourseName(new Scanner(System.in).nextLine());
		
		System.out.println("Enter Course Stream ");
		course.setCourseStream(new Scanner(System.in).nextLine());
		
		return course;
	}
	
	public Student getStudent()
	{
		Student student = new Student();
		System.out.println("Enter Student Name ");
		student.setName(new Scanner(System.in).nextLine());
	
		return student;
	}

}