package com.uni;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class AppRestriction {

	public static void main(String[] args) {
		System.out.println("project start");
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session sn=sf.openSession();
		
		Transaction ts=sn.beginTransaction();
		
		Criteria crt=sn.createCriteria(Student.class);
		//crt.add(Restrictions.ge("fees", 400));
		//geater (ge) is used
		
		//crt.add(Restrictions.eq("fees", 400));
		//for equals check
		
		//crt.add(Restrictions.lt("fees", 600));
		//lt is used of less thhan check
		
		
		//crt.add(Restrictions.le("fees", 400));
		//le shows less than or eqqls
		
		//crt.add(Restrictions.gt("fees", 400));
		//gt show greater than the vlaues
		
		//crt.add(Restrictions.like("fees", 400));
		//follow the specific pattern
		
		//crt.add(Restrictions.between("fees", 400,600));
		//all proprety between the values
		
		//crt.add(Restrictions.isNull("fees"));
		//check value isnull
		
		crt.add(Restrictions.isNotNull("fees"));
		//check which value is not null
		
		List<Student> lts=crt.list();
		System.out.println(lts);
		
		ts.commit();
		sn.close();
		
		

	}

}
