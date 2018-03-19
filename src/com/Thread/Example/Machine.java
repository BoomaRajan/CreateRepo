package com.Thread.Example;

public class Machine extends Thread {
	
	Operator operator;
	
	public void run() {
		while(true) {
			synchronized(operator) {
				try {
					operator.wait();
				}catch(InterruptedException ie){
					
				}
			}
		}
	}

}
