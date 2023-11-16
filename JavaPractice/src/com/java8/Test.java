package com.java8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		String str="aabbccddaabbcbbaa";
		
		System.out.println("Longist palindrome in a given String:   "+ longestPalindrome(str));
	}

	private static String longestPalindrome(String str) {
		if(null == str) {
			return "";
		}
		String longestString =String.valueOf(str.charAt(0));
		
		for(int i=0; i<= str.length()-1;i++) {
			
			String st = longestString(str, i, i);
			if(longestString.length()< st.length()) {
				longestString = st;
			}
		}
		
		return longestString;
	}

	private static String longestString(String str, int left, int right) {

		while(left>=0 && right<str.length() && str.charAt(left)== str.charAt(right)) {
			left--;
			right++;
		}
		
		return str.substring(left+1, right);
	}
	
}
