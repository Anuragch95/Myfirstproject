package com.uni;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App1 {

	public static void main(String[] args) {
		System.out.println("project start......");
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		final Session sn=sf.openSession();
		
		final Transaction ts=sn.beginTransaction();
		final JFrame jf=new JFrame("insert data");
		jf.setLayout(new FlowLayout());
		jf.setSize(500,500);
		
		final JTextField id=new JTextField(20);
		final JTextField ASname=new JTextField(20);
		final JTextField sadd=new JTextField(20);
		final JTextField fees=new JTextField(20);
		JButton sv=new JButton("save");
		JButton ex=new JButton("exit");
		
		jf.add(id);jf.add(ASname);jf.add(fees);jf.add(sadd);jf.add(sv);jf.add(ex);
		jf.setVisible(true);
		sv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Student s2=new Student();
				s2.setId(Integer.parseInt(id.getText()));
				s2.setAsname(ASname.getText());
				s2.setSadd(sadd.getText());
				s2.setFees(Integer.parseInt(id.getText()));
				sn.save(s2);
				ts.commit();
				id.setText(" ");
				ASname.setText(" ");
				sadd.setText("");
				
				
			}
		});
		
		ex.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			//	jf.setVisible(false);
			//	System.exit(0);
				sn.close();
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
