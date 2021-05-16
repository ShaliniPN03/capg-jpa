package com.capg.jpa.p1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainClass {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		
		System.out.println("1");
		
		Session session = factory.openSession();// jdbc -> coonection object
		Transaction t = session.beginTransaction();
		
		// ---- write code for data base operation ----
		
	     
		Account a = new Account();
		a.setAccId(101);
		a.setAccountHolderName("Ramesh");
		a.setBalance(2000);
		
		
		 
		
		System.out.println("  -->> Data Saved ..");
		//t.commit();
		
		
		
		
		
		//session.close();
		System.out.println("All Done");
		
		
		a=(Account)session.get(Account.class, 101);
		a.setAccountHolderName("Jai");    //update data
		a.setBalance(2500);
		session.saveOrUpdate(a);
		
		session.save(a);  // insert into Account .....

		
	}
}


