package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	
	public static void main(String[] args) {
		
		//create configuration object
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		//crate SessionFactory object
		SessionFactory sf = cfg.buildSessionFactory();
		
		//create Session object
		Session session = sf.openSession();
		
		//create transaction object
		Transaction t = session.beginTransaction();
		
		//create persistent object
		Employee emp = new Employee();
		
		emp.setEmp_name("Rohit");
		emp.setEmp_cmp("ICC");
		emp.setEmp_salary(1234);
		
		//storing the persistent object into database
		session.persist(emp);
		
		//commit the data
		
		t.commit();
		
		System.out.println("Done.");
		
		//close the session object
		session.close();
		
	}
}
