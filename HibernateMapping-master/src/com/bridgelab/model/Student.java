package com.bridgelab.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Student 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  
  @OneToMany(cascade = CascadeType.REMOVE,mappedBy = "student")
  private List<Laptop> laptops = new ArrayList<>();
  

public List<Laptop> getLaptops() {
	return laptops;
}
public void setLaptops(List<Laptop> laptops) {
	this.laptops = laptops;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", laptops=" + laptops + "]";
}
  
}
