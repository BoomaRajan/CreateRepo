package com.Thread.Example;

public class Reader extends Thread {
	
	Calculator c;
	
	public Reader(Calculator calc) {
		c = calc;
	}
	
	public void run() {
		synchronized(c) {
			try {
				System.out.println("Waiting for the Calculation" );
				c.wait();
			}catch(InterruptedException ie) {
				
			}
			System.out.println("Total"+c.total);
		}
	}
	
	public static void main(String args[]) {
		Calculator c = new Calculator();
		new Reader(c).start();
		new Reader(c).start();
		new Reader(c).start();
		c.start();
	}
	
	

}
