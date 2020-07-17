package com.practice;

public class PrimeNumber {

	public static void main(String[] args) {
	
		checkPrime(17);

	}

	private static void checkPrime(int i) {
		
		int m = i/2;
		boolean flag = true;
		
		if(i==0 || i==1) {
			System.out.println(i+"  is not a prime number");
		}else {
			for(int a=2; a<m; a++) {
				if(i%a ==0) {
					System.out.println(i+"  is not a prime number");
					flag = false;
					break;
				}
			}
		}
		
		if(flag) {
			System.out.println(i+"  is a prime number");
		}
		
	}

}
