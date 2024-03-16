package com.uni;

import java.io.ObjectInputFilter.Config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project start.." );
        Configuration cfg=new Configuration();
        cfg.configure("Hibernate.cfg.xml");
        
        SessionFactory sf=cfg.buildSessionFactory();
        
        Session sn=sf.openSession();
        
        Transaction ts=sn.beginTransaction();
        
        Student s1=new Student();
        s1.setId(103);
        s1.setAsname("arjun");
        s1.setFees(400);
        s1.setSadd("universal");
        sn.save(s1);
        ts.commit();
        sn.close();
        
        System.out.println("khatm..");
        
    }
}
