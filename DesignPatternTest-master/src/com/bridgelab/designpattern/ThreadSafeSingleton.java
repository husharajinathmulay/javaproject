package com.bridgelab.designpattern;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			System.out.println("ThreadSafeSingleton is creted");
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

}