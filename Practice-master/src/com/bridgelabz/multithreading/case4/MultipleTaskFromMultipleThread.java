package com.bridgelabz.multithreading.case4;

class MyThread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 100; i > 0; i--) {
			System.out.println(" i -> " + i);
		}
	}
}

class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int j = 100; j > 0; j--) {
			System.out.println(" j -> " + j);
		}
	}
}

public class MultipleTaskFromMultipleThread {
	public static void main(String[] args) {
		MyThread1 myt1 = new MyThread1();
		Thread t1 = new Thread(myt1);
		t1.start();
		
		
		
		MyThread2 myt2 = new MyThread2();
          Thread t2 =new Thread(myt2);
          t2.start();
	}
}
