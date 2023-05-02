package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop
{
  private String laptopname;
  private int price;
public String getLaptopname() {
	return laptopname;
}
public void setLaptopname(String laptopname) {
	this.laptopname = laptopname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Laptop [laptopname=" + laptopname + ", price=" + price + "]";
}

public void compile()
{ 
	System.out.println("laptop compiled");
}
}
