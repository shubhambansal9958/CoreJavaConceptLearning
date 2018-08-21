package com.concept.learning.polymorphism;

public class OverridingDemo {
	public static void main(String[] args) {
		
		
		invoker(new C());
		invoker(new A());
		invoker(new B());
		
		
	}
	
	public static void invoker(A ref) {
		//Cannot predict, which m1() would be called
		ref.m1();
	}
}

class A{
	public void m1() {
		System.out.println("m1() in A");
	}
}

class B extends A{
	@Override
	public void m1() {
		System.out.println("m1() in B");
	}
}

class C extends B{
	@Override
	public void m1() {
		System.out.println("m1() in C");
	}
}
