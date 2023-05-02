package com.bridgeit.fellowship.datastructure;

public class LinkedList
{  
@SuppressWarnings("rawtypes")
Node head;
    int size;
     
    public LinkedList()
    {   size=0;
    	head=null;
    }
  class  Node<E>
  	{
	   E data;
	   @SuppressWarnings("rawtypes")
	Node next;
	   
	  public Node(E data)
	  {
		  this.data=data;
		  next=null;
	  }
	  
	  
	 
	
  	}
   
   @SuppressWarnings("unchecked")
public <E> void insert(E data)
   {
	   Node<E> node = new Node<E>(data);
	   size++;
	if(head == null)
	{
		head = node;
	}
	else
	{  
		@SuppressWarnings("rawtypes")
		Node ptr = head;
		while(ptr.next!=null)
		{
			ptr = ptr.next;
		}
	
		ptr.next = node;
	}
	   
   }
  
   
   @SuppressWarnings("unchecked")
public<T>  void delete(T str)
   {
	   @SuppressWarnings("rawtypes")
	Node ptr = head;
		@SuppressWarnings("rawtypes")
		Node prev = head;
		if(ptr.data.equals(str)) 
		{
			head = ptr.next;
	        size--;
	
		}
		while(ptr.next!=null)
		{			
			if(ptr.data.equals(str))
			{
				prev.next = ptr.next;
				size--;
				
			}
			
		prev=ptr;
		ptr=ptr.next;
			
		
		}
		if(ptr.data.equals(str))
		{
			if(ptr.next==null)
			{
				prev.next=null;	
				size--;
		
			}
		}
   }
   @SuppressWarnings("rawtypes")
public <E extends Comparable<E>> boolean search(E data)
   {
	   Node ptr = head;

	
		while(ptr!=null)
		{			
			if(data.compareTo((E) ptr.data)==0)
			{
				 return  true;				
			}
		
			ptr=ptr.next;
			
		}
	
		return false ;

	   
   }
   public <E> void show()
   {

	   @SuppressWarnings("rawtypes")
	Node ptr = head;

		if(ptr==null) 
		{
		   
	       System.out.println("Empty");
	
		}
		while(ptr!=null)
		{			
			System.out.print(ptr.data+"->");
		
			ptr=ptr.next;
		}	
		//System.out.println(" "+ptr.data);


   }
   public <E> String getElement(int index)
   {     
		@SuppressWarnings("rawtypes")
		Node n = head;
		int count = 0;
		while(n!=null)
		{
			if(count == index)
				return (String)n.data;
			count ++;
			n = n.next;
		}
		return (String) "";
	   
   }
  

public int size() {
	// TODO Auto-generated method stub
	return size;
}
   
}
