package com.practice.junit.helper;

public class StringHelper {

	public String truncateAInFirst2Positions(String str) {
		if(str.length()<=2) {
			return str.replaceAll("A", "");
		}
		String first2char = str.substring(0, 2);
		String stringminusFirst2chat = str.substring(2);
		return first2char.replaceAll("A", "")+stringminusFirst2chat;
	}
	public static void main(String[] args) {

		StringHelper stringHelper = new StringHelper();
		System.out.println(stringHelper.truncateAInFirst2Positions("AACD"));

	}

}
