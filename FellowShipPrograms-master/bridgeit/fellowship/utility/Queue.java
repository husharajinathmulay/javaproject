package com.bridgeit.fellowship.utility;

public class Queue
{

			@SuppressWarnings("rawtypes")
			static Node head;
			
			@SuppressWarnings("rawtypes")
			public static class Node<E>
			{
				E data;
				
				Node next;
				
				public Node(E data)
				{
					this.data=data;
					next = null;
				}
			}
			
			
			/**
			 * This method add the new node/element at rear end of the queue 
			 * @param <E>
			 * it is generics data type
			 * @param item
			 * it is generics variable which store the value as string, int ,double etc;x
			 */
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public static <E> void enqueue(E data)
			{
				Node ptr;
				Node node = new Node(data);
				if(head==null)
				{
					head = node;
				}
				else
				{
					ptr = head;
					while(ptr.next!=null)
					{
						ptr=ptr.next;
					}
					ptr.next=node;
				
				}
			}
			
			/**
			 * This method remove the first node from front end of the queue
			 * @param <E>
			 * it is generics data type
			 * @return
			 * it return the data from queue
			 */
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public <E> E dequeue()
			{
				E data=null;
				if(!isEmpty())
				{
				Node ptr =head;
				data = (E) ptr.data;
				head = ptr.next;
				}else {
					System.out.println("Queue is Empty");
				}
				return data;
			}
			
			/**
			 * This method check whether queue empty or note
			 * @return
			 * return true if queue is empty means head pointing to null
			 */
			public static boolean isEmpty()
			{
				if(head==null)
					return true;
				return false;
			}
			
			/**
			 * This method add the new node/element at front end of the queue
			 * @param <E>
			 * it is generics data type
			 * @param item
			 * it is generics variable which store the value as string, int ,double etc;x
			 */
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public <E> void enqueueFront(E data)
			{
				Node ptr;
				Node node = new Node(data);
				if(head==null)
				{
					head = node;
				}else {
					ptr = head;
					
					ptr.next = ptr;
					head = ptr;
				}
			}
			
			
			
			/**
			 * This method add the new node/element at rear end of the queue
			 * @param <E>
			 * it is generics data type
			 * @param item
			 * it is generics variable which store the value as string, int ,double etc;x
			 */
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public static <E> void enqueueRear(E data)
			{
				Node ptr;
				Node node = new Node(data);
				if(head==null)
				{
					head = node;
				}else {
					ptr = head;
					
					while(ptr.next!=null)
					{
						ptr=ptr.next;
					}
					ptr.next=node;
				}
			}
		
			
			
			
			/**
			 *This method used for display the queue 
			 */
			@SuppressWarnings({ "rawtypes" })
			public static void printQueue()
			{
				if(!isEmpty())
				{
					Node ptr = head;
					
					while(ptr!=null)
					{
						System.out.print(ptr.data+" ");
						ptr= ptr.next;
					}
				}else {
					System.out.println("Queue is empty");
				}
			}
			
		
		
			/**
			 * This method remove the node from the front end of the queue
			 * @param <E>
			 * it is generics data type
			 * @return
			 * it return the data from current node in the queue
			 */
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public static <E> E dequeueFront()
			{
				E data=null;
				if(!isEmpty())
				{
				Node ptr = head;
				data = (E) ptr.data;
				head = ptr.next;
				}else {
					System.out.println("Queue is empty");
				}
				return data;
			}
			
			/**
			 * This method remove the last node from rear end of the queue
			 * @param <E>
			 * it is generics data type
			 * @return
			 * it return the data from queue
			 */
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public static <E> E dequeueRear()
			{
				E data=null;
				if(!isEmpty())
				{
					Node ptr = head;
					Node prevptr = ptr;
					while(ptr.next!=null)
					{
						prevptr = ptr;
						ptr=ptr.next;
					}
					data =(E) ptr.data;
					prevptr.next=null;
				}else {
					System.out.println("Queue is empty");
				}
				return data;
			}
			
			@SuppressWarnings({ "rawtypes" })
			public <E> boolean search(E x)
			{
				Node temp = head;
				while(temp!=null)
				{
					if(temp.data.equals(x))
					{
						return true;
					}
					temp=temp.next;
				}
				return false;
			}

			/**
			 * This method count number of nodes in the queue
			 * @return
			 * return the count of nodes;
			 */
			@SuppressWarnings({ "rawtypes"})
			public int size()
			{
				int count=0;
				Node ptr = head;
				
				while(ptr!=null)
				{
					count++;
					ptr= ptr.next;
				}
				return count;
			}
	}



