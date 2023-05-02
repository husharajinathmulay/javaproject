package com.bridgelabz.hibernate.repository;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class DBRepository {

//	public static void main(String[] args) {
//		
//		Configuration config = new Configuration().configure().addAnnotatedClass(Person.class);
//		
//		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
//		
//		SessionFactory factory = config.buildSessionFactory(registry);
//		
//		Session session = factory.openSession();
//		System.out.println("connected");
//		
//		Person person = new Person(2, "rahul");
//		
//		Transaction tx = session.beginTransaction();
//		
//		//session.save(person);
//		
//		Query query = session.createQuery("from Person");
//		
//		List<Person> list = query.list();
//		
//		for(Person person1 : list)
//		{
//			System.out.println(person1.getName());
//		}
//		
//		tx.commit();
//		
//		
//	}
	
	
	public static Session getSession()
	{   Configuration con=new Configuration().configure().addAnnotatedClass(Person.class);
	    ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
         SessionFactory	sf = con.buildSessionFactory(sr);
          Session session = sf.openSession();
		return session;
	}
	
	
	
}
