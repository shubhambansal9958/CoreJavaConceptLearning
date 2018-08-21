package com.concept.learning.threading;

public class CustomRunnable implements Runnable {

	private String name;
	public CustomRunnable(String name) {
		this.name = name;		
	}
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(name+" : "+i);
		}
	}

}
