package com.Thread.Example;

public class ThreadB  extends Thread{
	
	int total;
	
	/**public void run() {
		System.out.println(Thread.currentThread().getName()+"Run");
		synchronized(this) {
			for (int i =0 ;i<100;i++) {
				total += i;
			}
			notify();
		}
	}*/

}
