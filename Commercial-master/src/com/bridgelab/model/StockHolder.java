package com.bridgelab.model;


import java.util.List;

public class StockHolder
{
	private String name;
	private float balance;	
	List<String> companylist;
	List<Integer> sharslist ;
	
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{

		this.name = name;
	}

	public float getBalance()
	{
		return balance;
	}

	public void setBalance(float balance) 
	{
		this.balance = balance;
	}	
	public List<String> getCompanylist() {
		return companylist;
	}

	public void setCompanylist(List<String> companylist) {
		this.companylist = companylist;
	}

	public List<Integer> getSharslist() {
		return sharslist;
	}

	public void setSharslist(List<Integer> sharslist) {
		this.sharslist = sharslist;
	}

	
}

