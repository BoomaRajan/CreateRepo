package com.Thread.Example;

public class Leader implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("r1");
		System.out.println("r2");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Leader());
		t.start();
		System.out.println("m1 ");
		t.join();
		System.out.println("m2");

	}
	

}
