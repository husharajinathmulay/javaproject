package com.bridgelab.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class LaptopDemo
{ @Id 
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int lpid;
  private String lp_name;
  @ManyToMany(mappedBy = "laptoplist")
  private List<StudentDemo> list = new ArrayList<>();

  public int getLpid() {
	return lpid;
}
public void setLpid(int lpid) {
	this.lpid = lpid;
}
public String getLp_name() {
	return lp_name;
}
public void setLp_name(String lp_name) {
	this.lp_name = lp_name;
}
public List<StudentDemo> getList() {
	return list;
}
public void setList(List<StudentDemo> list) {
	this.list = list;
}

@Override
public String toString() {
	return "Laptop1 [lpid=" + lpid + ", lp_name=" + lp_name + ", list=" + list + "]";
}
  
}
