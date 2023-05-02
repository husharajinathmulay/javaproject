package com.bridgelabz.multithreading.case2;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(" i -> " + i);
		}

	}

}

public class SingleTaskFromMultipleThread {
	public static void main(String[] args) {
		MyThread myt1 = new MyThread();
		Thread t1 = new Thread(myt1);
		t1.start();

		MyThread myt2 = new MyThread();
		Thread t2 = new Thread(myt2);
		t2.start();

	}

}