package com.bridgeit.fellowship.utility;

public class StackUtility<E>
{
	
	@SuppressWarnings("rawtypes")
	static Node top;

	@SuppressWarnings("rawtypes")
	static class Node<E> {
		E data;

		Node next;

		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <E> void push(E data) {
		Node n = new Node(data);

		if (top == null) {
			top = n;
		} else {
			Node ptr = top;
			while (ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = n;
		}
	}

//this method is used for retrive data from the stack arr and remove the data from top of stack arr
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <E> E pop() {
		Node ptr = top;
		Node prevptr = ptr;
		E data = null;
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {

			while (ptr.next != null) {
				prevptr = ptr;
				ptr = ptr.next;
			}

			if (prevptr == ptr) {
				top = null;
			}
			data = (E) ptr.data;
//System.out.println(data);
			prevptr.next = null;
		}
		return data;
	}

// this method check if stack arr is empty or not
	public static boolean isEmpty() {
		if (top == null) {
			return true;
		}
		return false;
	}

//this method return the item from top of stack without removing the item from stack arr
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <E> E peek() {
		Node ptr = top;
		E data = null;
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {

			while (ptr.next != null) {
				ptr = ptr.next;
			}

			data = (E) ptr.data;
		}
		return data;
	}

// this method is return the size of the stack arr
	@SuppressWarnings({ "rawtypes" })
	public static int size() {
		int count = 0;
		Node ptr = top;
		while (ptr != null) {
			count++;
			ptr = ptr.next;
		}
		return count;
	}

}