package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MovieDemo extends Movie{
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Movie mt = new Movie();
		mt.setM_name("Idk");
		mt.setM_location("bengaluru");
		
		Movie_2D mobj = new Movie_2D();
		mobj.setM_name("Project Hail Mary");
		mobj.setCasting("Ryan Ghosling");
		
		Movie_3D md = new Movie_3D();
		md.setM_name("Hoppers");
		md.setDirector("Abc");
		
		session.persist(mobj);
		session.persist(mt);
		session.persist(md);
		
		t.commit();
		System.out.println("Done!");
		session.close();
		
	}

}
