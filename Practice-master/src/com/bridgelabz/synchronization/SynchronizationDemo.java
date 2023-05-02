package com.bridgelabz.synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
	SynchClass s1=	new SynchClass();
	SynchClass s2=	new SynchClass();
	
		MyThread t1 = new MyThread(s1);
		t1.start();
	
		MyThread t2 = new MyThread(s2);
		t2.start();
		

	}
}
