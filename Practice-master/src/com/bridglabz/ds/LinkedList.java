package com.bridglabz.ds;

public class LinkedList<E> {

	Node<E> head;

	public LinkedList() {
		head = null;
	}

	void insert(E data) {
	Node<E> node =new Node<E>(data);
	Node ptr =head;
	if(head==null)
	{
		node.data=data;
		node.next=null;
		head =node;
	}
	else 
	{
		
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}		
		ptr.next=node;
	}
	}
	
	public void printList()
	{
		if(head==null)
		{
			System.out.println(" list is empty");
		}
		else {
			Node ptr=head;
			while(ptr.next!=null)
			{
				System.out.println(" "+ptr.data);
				ptr=ptr.next;
			}
			System.out.println(" "+ptr.data);
			
			
		}
	}

	public void delete(E data) {
		 Node ptr  =head;
		 Node prevptr =ptr;
		 
		 if(ptr.data == data)
		 {
			head= ptr.next;
		 }
		 while(ptr.next!=null)
		 {
			 if(ptr.data==data)
			 {
				prevptr.next= ptr.next;
			 }
			 prevptr=ptr;
			 ptr=ptr.next;
		 }
		 
		 if(ptr.next==null)
		 {
			 if(ptr.data==data)
			 {
				 prevptr.next=null;
			 }
		 }
	}
		
	}


