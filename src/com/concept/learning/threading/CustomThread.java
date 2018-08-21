package com.concept.learning.threading;

public class CustomThread extends Thread {
	
	private String name;
	public CustomThread(String name) {
		super(name);
		this.name = name;		
	}
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(name+" : "+i);
		}
	}
}
