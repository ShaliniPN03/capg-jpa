package com.capg.jpa.p3;

import java.time.LocalDate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {
	
	public static void main(String[] args) {
		
		Examination exam=new Examination("AWP",100,3);
		Internal internal1=new Internal("AI",100,1,3,25);
		External external1=new External("WMC",100,3,LocalDate.now(),85);
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		
		Session session = factory.openSession();// jdbc -> coonection object
		

		Transaction t = session.beginTransaction();
		
		session.save(exam);
		session.save(internal1);
		session.save(external1);
		
		t.commit();
		
	}

}
