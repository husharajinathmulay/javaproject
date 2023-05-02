package com.bridgelab.model;

public class StockReport 
{
	private String buyername;
	private int buyshares;
	private String sellername;
	
		public String getSellerName() 
		{
			return sellername;
		}

	public void setSellerName(String sellername) 
	{
		this.sellername = sellername;
	}

		public String getBuyername()
	{
		return buyername;
	}

	public void setBuyername(String buyername)
	{
		this.buyername = buyername;
	}

	public int getBuyshares() 
	{
		return buyshares;
	}

	public void setBuyshares(int buyshares)
	{
		this.buyshares = buyshares;
	}

	
}
