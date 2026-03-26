package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;
public class CriteriaDemo {
	public static void main(String args[]) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction t=session.beginTransaction();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Student> cq=cb.createQuery(Student.class);
		cq.distinct(true);
		Root<Student> rt=cq.from(Student.class);
		cq.select(rt);
		TypedQuery<Student> tq=session.createQuery(cq);
		List<Student> list=tq.getResultList();
		System.out.println(list);
	}

}
