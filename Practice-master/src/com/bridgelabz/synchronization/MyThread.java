package com.bridgelabz.synchronization;

public class MyThread extends Thread{


	SynchClass synch;
	
	public MyThread(SynchClass synchObj) {
	  this.synch =synchObj;
	}
	
@Override
public void run() {
	try {
		synch.disp();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


	
}


