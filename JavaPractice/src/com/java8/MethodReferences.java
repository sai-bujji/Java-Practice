package com.java8;

interface TestMethodreference{
	void display();
}
public class MethodReferences {

	public static void display() {
		TestMethodreference test = ()->{
			System.out.println("Test method refernce example");
		};
		test.display();
	}
	public static void main(String[] args) {
		TestMethodreference te = MethodReferences::display;
		te.display();
}

}
