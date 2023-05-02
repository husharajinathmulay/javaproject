package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableTest {
	public static void main(String[] args) {
		
		ArrayList<Student>  arr = new ArrayList<Student>();
		Student s2=new Student(2, "amol", "patil");
			
		Student s1=new Student(1, "rahul", "patil");
		Student s3=new Student(3, "rakesh", "patil");
		
		arr.add(s2);
		
		arr.add(s1);
		arr.add(s3);
		
		System.out.println("before sorting"+arr);
		Collections.sort(arr);
		System.out.println("after sorting"+arr);
		
		
	}

}
