package com.test;

import java.util.Arrays;
import java.util.List;

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
		
		Order o1 = new Order();
		o1.setO_name("mugs");
		o1.setO_price("200");
		
		Order o2 = new Order();
		o2.setO_name("Mouse");
		o2.setO_price("3000");
		
		List<Order> list = Arrays.asList(o1,o2);
		User user = new User();
		user.setU_name("Mahika");
		user.setOrder(list);
		
		o1.setUser(user);
		o2.setUser(user);
		
		session.persist(user);
		t.commit();
		System.out.println("Done!");
		session.close();
		
	}
}



