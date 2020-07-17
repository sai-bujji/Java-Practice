package com.practice;

public class PrintPattern {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			int count =i;
			while(count>0) {
				System.out.print("* ");
				count--;
			}
			System.out.println();
		}

	}

}
