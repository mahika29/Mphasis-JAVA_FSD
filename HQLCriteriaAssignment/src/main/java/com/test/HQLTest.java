package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLTest {
	public static void main(String[]args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		//String hql="select o.o_name,o_price,o_quantity from Order o";
		String hql1="delete from Order where id= :id";
		Query query=session.createQuery(hql1);
		query.setParameter("id", 1);
		query.executeUpdate();
		t.commit();
		String hql="from Order";
		
		
		Query<Student> q=session.createQuery(hql,Student.class);
		List<Student> list=q.getResultList();
		list.forEach(dt -> System.out.println(dt.getName()+" "+dt.getMarks()));
	}

}
