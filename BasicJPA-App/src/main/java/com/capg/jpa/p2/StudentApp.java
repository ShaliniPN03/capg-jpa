package com.capg.jpa.p2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.fabric.xmlrpc.base.Array;





public class StudentApp {
	
	public static void main(String[] args) {
		
	
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		
		System.out.println("1");
		
		Session session = factory.openSession();// jdbc -> coonection object
		Transaction t = session.beginTransaction();
		// ---- write code for data base operation ----
		
		Student s=new Student();
		s.setName("Allen");
		s.setMarks(88);
		s.setAge(18);
		Certificate c=new Certificate("Ml");
		s.setCertificate(c);
		
		Course c1=new Course("R&S",3,121);
		Course c2=new Course("AI",6,110);
		Course c3=new Course("VLSI",8,103);
		List<Course> list=Arrays.asList(c1,c2,c3);
		s.setCourses(list);
		
		Scholarship scholarship=new Scholarship(1124,"EPASS",19000,LocalDate.parse("2021-02-18"));
		s.setScholarship(scholarship);

		
		
		session.save(s);  // insert into Account .....
		
	
		
		/*----------------------Display data--------------------*/
	/*	s=(Student)session.get(Student.class,1);
		System.out.println(s);
		*/
		
		
	//	System.out.println("ID--------"+scholarship.getApplicationNumber());
	//	System.out.println("----------------->"+s.getScholarship().getApplicationNumber());
	/*	Scholarship scholarship=session.get(Scholarship.class,1124);
		System.out.println("\n Scholarship Info :- "+scholarship);
		System.out.println("\n Scholarship Info  :- "+scholarship.getStudent());
		System.out.println("\n Scholarship Name   :- "+scholarship.getStudent().getName());
		*/
		
		
/*---------------------Update----------------------------*/
	/*	s=(Student)session.get(Student.class,2);
		s.setMarks(60);
		session.saveOrUpdate(s);*/
		
/*-----------------Retrieve data and update course----------------------------*/		
	/*	s=(Student)session.get(Student.class,1);
		System.out.println(s);
		List<Course>list=s.getCourses();
		System.out.println(list);
		Course c1=new Course("Cisco R&S",3,121);
		list.set(0,c1);
	*/	
		
		
		
		
/*---------------------Delete-------------------------------------*/		
/*		s=(Student)session.get(Student.class,2);
		session.delete(s);
		
*/
		System.out.println("  -->> Data Saved ..");
		t.commit();
		
		
		
		
		
		session.close();
		System.out.println("All Done");
		
		
	}
	
	
	



}