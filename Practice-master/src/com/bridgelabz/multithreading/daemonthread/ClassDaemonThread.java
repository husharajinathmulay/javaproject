package com.bridgelabz.multithreading.daemonthread;

class MyThread implements Runnable
{

	@Override
	public void run() {
	 for (int i = 0; i < 10; i++) {
		System.out.println("hellow i ->"+i);
	}
		
	}

}


public class ClassDaemonThread {
	
	public static void main(String[] args) {
		
		MyThread task = new MyThread();
		 Thread t1 =new Thread(task);	 
		 System.out.println(" Inside main ");
		 t1.setDaemon(true);
		 t1.start();
	}

}
