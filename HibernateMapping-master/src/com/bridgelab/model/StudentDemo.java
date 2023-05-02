package com.bridgelab.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class StudentDemo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@ManyToMany
	private List<LaptopDemo> laptoplist = new ArrayList<>();

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

	public List<LaptopDemo> getLaptop() {
		return laptoplist;
	}

	public void setLaptop(List<LaptopDemo> laptop) {
		this.laptoplist = laptop;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", laptop=" + laptoplist + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getLaptop()=" + getLaptop() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
