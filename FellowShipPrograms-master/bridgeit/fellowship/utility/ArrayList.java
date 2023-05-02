package com.bridgeit.fellowship.utility;

import com.bridgeit.fellowship.datastructure.LinkedList;

public class ArrayList
{ 
	   LinkedList list;

		  public ArrayList(LinkedList l)
		  {
			 this.list=l;
		  }
	  
   
   public static void addAllList(Object obj[],int index,LinkedList list)
   {   
	   for(int i=0;i<11;i++)
	   {
	    	  if(i==index)
	    	  {
	    		 obj[i]=(LinkedList)list;
	    	  }
	   }
   }
   
   public static void showAll(Object obj[])
   {
	   for(int i=0;i<11;i++)
	   {
		   System.out.println("  "+obj[i].toString());
	   }
   }
}
