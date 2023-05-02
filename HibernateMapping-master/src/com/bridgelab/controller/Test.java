package com.bridgelab.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import com.bridgelab.model.Laptop;
import com.bridgelab.model.Student;
public class Test {
	public static void main(String[] args)
	{
		 Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		    ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	         SessionFactory	sf = con.buildSessionFactory(sr);
	          Session session = sf.openSession();
	          Transaction t=session.beginTransaction();
	          
	          Student student = new Student();
				
				student.setName("milind");								
				Laptop laptop1 = new Laptop();
				laptop1.setLaptopName("hp");
				Laptop laptop2 = new Laptop();
				laptop2.setLaptopName("dell");
				laptop1.setStudent(student);
				laptop2.setStudent(student);
				student.getLaptops().add(laptop1);
				student.getLaptops().add(laptop2);
				
				
				session.save(laptop1);
				session.save(laptop2);
				session.save(student);
				t.commit();
			
	}
}

/*
 *      
			

			 
			 
*/

//Transaction t=session.beginTransaction();
//Query list = session.createQuery("from Laptop");	          
//List<Laptop> listL = list.list();
//Iterator<Laptop> lIterator = listL.iterator();
//while(lIterator.hasNext())
//{
//	 System.out.println(lIterator.next());
//