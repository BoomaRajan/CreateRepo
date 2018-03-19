package com.Thread.Example;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void printAll(String[] lines) throws InterruptedException {
		for(int i =0;i<lines.length;i++){
			System.out.println(lines[i]);
		//	Thread.currentThread();
			Thread.sleep(1000);
		}
	}

}
