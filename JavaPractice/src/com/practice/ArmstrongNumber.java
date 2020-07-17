package com.practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a =153,n=a;
		int b=0;
		int c=0;

		while(n>0) {
			c = n%10;
			b = b+(c*c*c);
			n = n/10;
		}
		
		if(b== a) {
			System.out.println("given no is armstrong number");
		}else {
			System.out.println("given no is not a armstrong number");
		}
	}

}
