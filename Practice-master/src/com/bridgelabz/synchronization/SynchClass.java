package com.bridgelabz.synchronization;

public class SynchClass {
	public void disp() throws InterruptedException {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		}

	}
}
