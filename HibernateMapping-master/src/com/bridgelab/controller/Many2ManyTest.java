package com.bridgelab.controller;


import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.bridgelab.model.LaptopDemo;
import com.bridgelab.model.StudentDemo;

public class Many2ManyTest {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(StudentDemo.class).addAnnotatedClass(LaptopDemo.class);
	
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory(sr);
		
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		StudentDemo studentDemo1 = new StudentDemo();
		studentDemo1.setName("sachin");
		
		StudentDemo studentDemo2 = new StudentDemo();
		studentDemo2.setName("sonu");
		
		LaptopDemo laptopDemo1 = new LaptopDemo();
		laptopDemo1.setLp_name("lenovo");
		LaptopDemo laptopDemo2 = new LaptopDemo();
		laptopDemo2.setLp_name("DeLL");
		
		studentDemo1.getLaptop().add(laptopDemo1);
		studentDemo1.getLaptop().add(laptopDemo2);
		
		laptopDemo1.getList().add(studentDemo1);
		laptopDemo1.getList().add(studentDemo2);
		
		studentDemo2.getLaptop().add(laptopDemo1);
		studentDemo2.getLaptop().add(laptopDemo2);
		
		laptopDemo2.getList().add(studentDemo1);
		laptopDemo2.getList().add(studentDemo2);
		
		s.save(laptopDemo1);
		s.save(laptopDemo2);
		s.save(studentDemo1);
		s.save(studentDemo2);
		
		tr.commit();
	}

}
