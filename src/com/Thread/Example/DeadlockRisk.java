package com.Thread.Example;

import javax.annotation.Resource;

public class DeadlockRisk {
	
	private static class Resource {
		private int value;
	}
	
	private Resource resourceA = new Resource();
	private Resource resourceB = new Resource();
	
	public int read() {
		synchronized(resourceA) {
			synchronized(resourceB) {
				return resourceB.value + resourceB.value; 
			}
		}
	}
	
	
	public void write(int a,int b) {
		synchronized(resourceB) {
			synchronized(resourceA) {
				resourceA.value = a;
				resourceA.value = b;
			}
		}
	}

}
