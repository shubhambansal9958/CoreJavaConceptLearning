package com.concept.learning.polymorphism;

public class OverloadingDemo {
	public void m1(int x) {
		System.out.println("Single Integer : " + x);
	}

	public void m1(int x, int y) {
		System.out.println("Two Integer : " + x + "," + y);
	}

	public void m1(String str) {
		System.out.println("String Found : " + str);
	}
	
	public static void main(String[] args) {
		OverloadingDemo demo = new OverloadingDemo();
		demo.m1(5);
		demo.m1(4,5);
		demo.m1("Hello World");
	}
}
