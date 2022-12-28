package com.test;
class A{
	A(){
		System.out.println("A constructor");
	}
	void display() {
		System.out.println("instant method A");
	}
	
	static void staticdisplay() {
		System.out.println("static method A");
	}
}
class B extends A{
	B(){
		System.out.println("B constructor");
	}
	void display() {
		System.out.println("instant method B");
	}
	
	static void staticdisplay() {
		System.out.println("static method B");
	}
}
public class InstantStaticEx {
	public static void main(String ar[]) {
		A b = new B();
		b.display();
		b.staticdisplay();
	}
	
}
