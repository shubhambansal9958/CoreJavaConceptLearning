package com.concept.learning.locking;

public class TaskController {

	public static void main(String[] args) {
		Printer printer = new Printer();

		Runnable generator1 = new StatementGenerator(printer, "Hello World");
		Runnable generator2 = new StatementGenerator(printer, "Thanks....");
		Runnable generator3 = new StatementGenerator(printer, "Good Bye!!!");
		
		Thread thread1 = new Thread(generator1);
		Thread thread2 = new Thread(generator2);
		Thread thread3 = new Thread(generator3);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
