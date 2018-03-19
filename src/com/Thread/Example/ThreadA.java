package com.Thread.Example;

public class ThreadA {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadB b = new ThreadB();
		b.start();
		synchronized(b) {
			try {
				System.out.println("Waiting to complete");
				b.wait();
			}catch(InterruptedException ie) {
				System.out.println("The Total Count is"+b.total);
			}
		}
		System.out.println("The Total Count is"+b.total);

	}

}
