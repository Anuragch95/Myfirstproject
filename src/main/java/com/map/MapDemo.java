package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.uni.*;

public class MapDemo {

	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
	        cfg.configure("Hibernate.cfg.xml");
	        
	        SessionFactory sf=cfg.buildSessionFactory();
	        Question q1=new Question();
	        q1.setQuestionId(1212);
	        q1.setQuestion("what is java");
	        
	        Answer answer=new Answer();
	        answer.setAnswerId(343);
	        answer.setAnswer("java is a programing ");
	        q1.setAnswer(answer);
	        
	        Session sn=sf.openSession();
	        
	        Transaction ts=sn.beginTransaction();
	        sn.save(q1);
	        sn.save(answer);
	        ts.commit();
	        sn.close();
	        sf.close();
	       

	}

}
