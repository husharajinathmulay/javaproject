package com.bridgelab.demo;

public class Person 
{
 private String name;
 private int age;
 private String qualification;
public Person() {
	// TODO Auto-generated constructor stub
}
public Person(String name, int age, String qualification) {
	super();
	this.name = name;
	this.age = age;
	this.qualification = qualification;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", qualification=" + qualification + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}

}
