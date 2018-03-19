package com.Thread.Example;

public class Operator extends Thread {
	
	public void run() {
		while(true) {
			//Get shape from the user
			synchronized(this) {
				//calculate new machine steps from shape
				notify();
			}
		}
	}

}
