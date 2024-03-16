package com.uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SecondLevelCache {

	public static void main(String[] args) {
		System.out.println("project start..");
		 
		
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session sn=sf.openSession();
		Session sn1=sf.openSession();
		
		Transaction ts=sn.beginTransaction();
		Transaction ts1=sn1.beginTransaction();
		
		Student std=(Student)sn.get(Student.class,102);
		
		ts.commit();
		sn.close();
		
		Student std1=(Student)sn1.get(Student.class,102);
		ts1.commit();
		sn1.close();
		
		System.out.println(std);
		System.out.println(std1);
		
		
		
		

	}

}
