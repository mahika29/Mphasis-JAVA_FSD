package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Employee emp=new Employee();
		emp.setE_name("Harshini");
		emp.setE_company("Her-She");
		
		FullTimeEmployee femp=new FullTimeEmployee();
		femp.setE_name("Y");
		femp.setSalary(25000);
		
		PartTimeEmployee pemp=new PartTimeEmployee();
		pemp.setE_name("V");
		pemp.setHourlyrate(5000);
		
		session.persist(emp);
		session.persist(femp);
		session.persist(pemp);
		
		t.commit();
		System.out.println("Done");

}
}