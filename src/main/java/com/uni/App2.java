package com.uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {

	public static void main(String[] args) {
		System.out.println("project start");
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session sn=sf.openSession();
		
		Transaction ts=sn.beginTransaction();
		Student s=new Student();
		//mai sikh rha tha

	}

}
