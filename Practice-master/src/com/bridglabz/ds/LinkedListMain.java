package com.bridglabz.ds;

import java.util.Collections;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert("milind");
		list.insert(23);
		list.insert(34);
		list.printList();
		System.out.println("After delete element");
    	list.delete(34);        
		list.printList();
		Collections.sort(null);
	}

}
