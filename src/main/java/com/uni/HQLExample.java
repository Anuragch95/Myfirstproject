package com.uni;

//import java.lang.invoke.ClassSpecializer.Factory;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLExample {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		//String query="from student";
		
		Query q=s.createQuery("from Student");
		
		List<Student> list=q.list();
		
		for(Student student:list)
		{
			System.out.println(student);
			
		}
		t.commit();
		s.close();
		sf.close();
		
			
		

		
	}

}
