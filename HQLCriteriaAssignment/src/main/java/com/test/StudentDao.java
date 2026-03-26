package com.test;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class StudentDao {
	public static SessionFactory getDBSessionF() {
		SessionFactory factory=null;
		try {
			//Configuration cfg=new Configuration();
			//cfg.configure("hibernate.cfg.xml");
			factory=HibernateUtil.getSessionFactory();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return factory;
	}
	public void saveStudent(Student obj) {
		Session session=StudentDao.getDBSessionF().openSession();
		Transaction t=session.beginTransaction();
		session.persist(obj);
		t.commit();
	}
	public List<Student> listAllOrders(){
		Session session=StudentDao.getDBSessionF().openSession();
		//Transaction t=session.beginTransaction();
		Query<Student> q=session.createQuery("from Student",Student.class);
		List<Student> list=q.list();
		session.close();
		return list;
	}
	public void  UpdateStudent(Student obj) {
		Session session=StudentDao.getDBSessionF().openSession();
		Transaction t=session.beginTransaction();
		Student dt=session.find(Student.class, obj.getId());
		
		dt.setName(obj.getName());
		dt.setMarks(obj.getMarks());
		session.persist(dt);
		t.commit();
		session.close();
	}
	public void deleteOrder(Student obj) {
		Session session=StudentDao.getDBSessionF().openSession();
		Transaction t=session.beginTransaction();
		session.remove(obj);
		t.commit();
		session.close();
	}
}
