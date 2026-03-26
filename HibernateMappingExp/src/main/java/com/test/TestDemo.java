package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {
	public static void main(String[] agrs) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Address add = new Address();
		add.setCity("udupi");
		add.setState("Karanataka");
		
		Employee emp = new Employee();
		emp.setE_name("Harsha");
		emp.setE_company("ABCcd");
		
		emp.setAddress(add);
		add.setEmp(emp);
		
		session.persist(emp);
		
		t.commit();
		System.out.println("Done!");
		
		session.close();
		
		
		
		
	}

}
