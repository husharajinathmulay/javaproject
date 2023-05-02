package com.bridgelabz.algorithmprograms;

public class Student implements Comparable<Student>{
 private int rollNo;
 private String name;
 private String address;
public Student(int rollNo, String name, String address) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
}
@Override
public int compareTo(Student o) {
	  if(name.equals(o.name)) {
		  return 0;
	  }
	  else if(rollNo >o.rollNo){
		  return 1;              // 
		  
	  } 
	   return -1;  // reverse order
}
 

}
