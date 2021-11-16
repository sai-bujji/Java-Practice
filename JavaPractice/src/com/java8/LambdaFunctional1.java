package com.java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaFunctional1 {
	
	public static void testDisplay() {
		List<String> li = new ArrayList<>();
		li.add("Hishika");
		li.add("Sai");
		li.add("Madhuri"); 
		
		li.forEach((n)->System.out.println(n));
	}
	
		public static void main(String[] args) {

		testDisplay();
	}

}
