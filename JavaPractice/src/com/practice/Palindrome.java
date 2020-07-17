package com.practice;

public class Palindrome {

	public static void main(String[] args) {

		plaindromeStr("madam");

		palindromeInt(131);

	}

	private static void palindromeInt(int n) {

		int r, sum = 0, temp;
		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

	}

	private static void plaindromeStr(String string) {

		String[] str = string.split("");
		String reverseStr = "";

		for (int i = str.length - 1; i >= 0; i--) {
			reverseStr = reverseStr + str[i];
		}

		if (string.equalsIgnoreCase(reverseStr)) {
			System.out.println("given string is palindrome");
		} else {
			System.out.println("given string is not a palindrome");
		}

	}

}
