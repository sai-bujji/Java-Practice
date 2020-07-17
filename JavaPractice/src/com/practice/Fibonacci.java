package com.practice;

public class Fibonacci {

	public static void main(String[] args) {

		int i=0, j=1,c=0;
		
		int x = 10;
		System.out.println(0);
		System.out.println(1);
		for(int a = 0; a < x-2; a++) {
			c= i+j;
			i = j;
			j = c;
			System.out.println(c);
		}

	}

}
