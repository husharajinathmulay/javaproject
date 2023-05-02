package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To maintain cash counter data. 
* 
* @author Milind Patil
* @version 1.0
* since: 26-11-2019
* */
public class QueueUtility {
   static Node head;
	static int size;

	public QueueUtility() {
		size = 0;
		head = null;
	}

	static class Node 
	{
		int acc_no;
	     String u_name;
		float bal;
		Node next;

		public Node(int  acc_no,String u_name,float bal) 
		{
			this.bal=bal;
			this.u_name=u_name;
			this.acc_no=acc_no;
			next = null;
		}

	}

	
	public static void addUser(int  acc_no,String u_name,float bal) {
	
		Node node = new Node(acc_no,u_name,bal);
		size++;
		if (head == null) {
			head = node;
		} else {
			Node ptr = head;
			while (ptr.next != null) {
				ptr = ptr.next;
			}
				ptr.next = node;
		}
		System.out.println("Account Added Successful "+node.u_name);
		
	}

	

	public static void show()
	{

		Node ptr = head;

		if (size==0)
		{

			System.out.println("Empty");

		}
		while (ptr.next != null) 
		{
			System.out.println(" " + ptr.acc_no+"	"+ptr.u_name+"	"+ptr.bal);

			ptr = ptr.next;
		}
		System.out.println(" " + ptr.acc_no+"	"+ptr.u_name+"	"+ptr.bal);

	}
	
	public static void search(int acc)
	{   
	
        if(head==null)
        {
        	System.out.println("Empty");
        }
        else 
        {
        	if(acc==head.acc_no)
        	{
        		transaction(acc);
        	}
           else
           {  
        	   Node ptr=head;
			 while(ptr.next != null) 
			 {	
				if (acc==ptr.acc_no)
				{ 
					transaction(acc);			
				}
			
				ptr = ptr.next;
			 }
			 if(ptr.acc_no==acc)
			 {
				 transaction(acc);
			 }
			}   
				System.out.println("invalid account number");	
        }

	}

	
	
	public static void transaction(int acc)
	{
		 Node ptr = head;
		 int ch;
		 int amount;
	             
	            	 System.out.println("select option:=====>>>> ");
	            	 System.out.println("1:withdraw");
	            	 System.out.println("2:deposit");
	            	 System.out.println("3:Exit");
	            	  ch=Utility.inputInt();
	            	 switch(ch)
	            	 {
	            	 case 1:
	            		  	if(ptr.bal<0)
	            		  	{
	            		  	   System.out.println("insufficient balance");	
	            		  	}
	            		  	else
	            		  	{
	            		  		System.out.println("Enter amount");
	            		  		amount=Utility.inputInt();
	            		  		if(amount>ptr.bal && amount<=0)
	            		  		{
	            		  			System.out.println("invalid amount");
	            		  		}
	            		  		else
	            		  		{
	            		  			ptr.bal=ptr.bal-amount;
	            		  			System.out.println("Your balance is"+ptr.bal);
	            		  		}
	            		  	}
	            		 break;
	            	 case 2:
	            		 	System.out.println("Enter amount");
            		  		amount=Utility.inputInt();
	            		    if(amount>0)
	            		    {
	            		    	ptr.bal=ptr.bal+amount;
	            		    	System.out.println("Your current balance is"+ptr.bal);
	            		    }
	            		    else
	            		    	System.out.println("invalid amount");
	            		 break;
	            	 case 3:
	            		 System.exit(0);
	            		 break;
	            		 default:
	            			System.out.println("Enter proper choice");
	            	 }
	           System.out.println("Thank you for Connect with Bank");	
			}
				
	
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
