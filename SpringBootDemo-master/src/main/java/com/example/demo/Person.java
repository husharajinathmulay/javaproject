package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {
	private String name;
	private String address;
	@Autowired
	private Laptop laptop;

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", laptop=" + laptop + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void personDetail() {
		System.out.println("name:ABC");
		System.out.println("Address:Address");
		laptop.compile();
	}
}
