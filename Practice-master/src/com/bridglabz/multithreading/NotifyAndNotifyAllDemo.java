package com.bridglabz.multithreading;

class A implements Runnable
{

	@Override
	public void run() {
		synchronized (this) {
			for(int i= 0;i<10;i++)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(" i=> "+i);
			}
			this.notifyAll();
		}
		
	}
    	
}
public class NotifyAndNotifyAllDemo {
	
	public static void main(String[] args) throws InterruptedException {
		A a =new A();
		Thread thread = new Thread(a);
		thread.start();
		synchronized (a) {	
			System.out.println("Inside main method......");
			a.wait();
			System.out.println("After thread A execution........");
		}
	
		
	}

}
