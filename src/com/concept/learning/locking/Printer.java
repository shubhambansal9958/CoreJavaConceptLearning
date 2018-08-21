package com.concept.learning.locking;

import java.util.concurrent.locks.ReentrantLock;

public class Printer {

	private ReentrantLock lock;
	
	public Printer() {
		lock = new ReentrantLock();
	}

	

	public void printStatement(String statement) {
		lock.lock();		

		System.out.println("Printing Initiated");
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Print "+i+" : "+statement);
		}
		
		System.out.println("Printing Completed");
		
		lock.unlock();
	}

}
