package com.uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App3 {

	public static void main(String[] args) {
		System.out.println("project start");
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session sn=sf.openSession();
		
		Transaction ts=sn.beginTransaction();
		
		Student s1=new Student(999,"praveen","pune",600);
		sn.save(s1);
		ts.commit();
		sn.close();
		
		Session sn1=sf.openSession();
		
		Transaction ts1=sn1.beginTransaction();
		Employee emp=new Employee();
		emp.setId(8);
		emp.setEmpname("hello");
		emp.setSal(500);
		
		sn1.save(emp);
		ts1.commit();
		sn1.close();
		
		
		
		
		

	}

}
