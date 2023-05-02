package com.bridgelab.designpattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable
{

	private static final long serialVersionUID = -7604766932017737115L;

	SerializedSingleton() 
	{
		
	}

	private static class SingletonHelper
	{
		private static  SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() 
	{
		return SingletonHelper.instance;
	}

}