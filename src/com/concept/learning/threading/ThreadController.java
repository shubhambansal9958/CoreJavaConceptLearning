package com.concept.learning.threading;

public class ThreadController {

	public static void main(String[] args) {
		
		
		Runnable runnable1 = new CustomRunnable("Runnable 1");
		Runnable runnable2 = new CustomRunnable("Runnable 2");
		Runnable runnable3 = new CustomRunnable("Runnable 3");
		
		Thread thread1 = new CustomThread("Thread 1");
		Thread thread2 = new CustomThread("Thread 2");
		Thread thread3 = new CustomThread("Thread 3");
		Thread thread4 = new Thread(runnable1);
		Thread thread5 = new Thread(runnable2);
		Thread thread6 = new Thread(runnable3);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		
		
		System.out.println("main() Exited");
	}

}
