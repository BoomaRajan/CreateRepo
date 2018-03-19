package com.Thread.Example;

public class MyThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		Thread x = new Thread(t);
		x.start();

	}
	
	public void run() {
		for (int i = 0;i<3;i++) {
			System.out.println("i"+i);
		}
	}

}
