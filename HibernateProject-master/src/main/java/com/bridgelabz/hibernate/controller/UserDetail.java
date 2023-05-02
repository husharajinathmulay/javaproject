package com.bridgelabz.hibernate.controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.bridgelabz.hibernate.repository.DBRepository;
import com.bridgelabz.hibernate.repository.Person;
import com.bridgelabz.hibernate.utility.Utility;

public class UserDetail
{  static Session session;
   static Transaction t;
 	public static void main(String[] args)
	{	  session=DBRepository.getSession();
        	  
	    int ch;
	  try {
		  do	    		    	    
	       {
	     	System.out.println("Select Option: ");
	    	System.out.println("1:Add Person Data");
	    	System.out.println("2:Delete Person Data");
	    	System.out.println("3:Update Person Data");
	    	System.out.println("4:Save Transaction");
	    	System.out.println("5:Cancel Transaction");
	    	System.out.println("6:Exit");
	    	System.out.println("Enter Your choice");
	         ch=Utility.inputInt();
	    	switch(ch)
	    	{
	    	case 1: 
	    		    insert();
	    		break;
	    	case 2: delete();
	    		break;
	    	case 3: update();
	    		break;
	    	case 4: save();
	    		break;
	    	case 5: cancel();
    			break;
	    	case 6:
	    		   System.out.println("Thank you for visiting");
	    		  System.exit(0);
	    		break;
	    	default:System.out.println("Enter Proper choice");
	    	}
	    	
	    }while(ch<6 &&ch>0);
	  }
	  catch(Exception e)
	  {
		   t.rollback();
		   session.close();
	  }
	      	
	}

	private static void cancel() {
		try {
		   t.rollback();
		   System.out.println("Note: Your transaction has been cancle");
		}
		catch(Exception e)
		{
           System.out.println("sooooooory you can't select this option because your transaction not started");			
		}
	}
	private static void save() {
		try {
		    t.commit();
		 }
		 catch(Exception e)
		{
			 System.out.println("sooooooory you can't select this option because your transaction not started");
		}
	}

	private static void update() {
		System.out.println("1");
		 t=session.beginTransaction();
		 System.out.println("2");
		 Query q = session.createQuery("update Person p set p.name=?  where p.id=?");
		System.out.println("Enter User Id");
		q.setParameter(1, Utility.inputInt());
		System.out.println("Enter User Name");
		q.setParameter(0, Utility.inputString());
		
		int check=q.executeUpdate();
		if (check > 0) {
			System.out.println("Person data is Inserted");
		} else {
			System.out.println("Person data is not inserted");
		}
	}

	private static void delete() 
	{    
	      t=session.beginTransaction();
		Query q = session.createQuery("delete from Person p where p.id=?");
		System.out.println("Enter User Id");
		q.setParameter(0, Utility.inputInt());
		int check = q.executeUpdate();
		if (check > 0) {
			System.out.println("Person data is deleted");
		} else {
			System.out.println("Person data is not deleted");
		}

	}

	private static void insert() {
		 t=session.beginTransaction();
		Person person =new Person();
		System.out.println("Enter User ID");
		person.setId(Utility.inputInt());
		System.out.println("Enter User Name");	
		person.setName(Utility.inputString());		
		session.save(person);	
	}

}
