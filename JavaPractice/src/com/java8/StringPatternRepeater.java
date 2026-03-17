package com.java8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPatternRepeater {

	public static void main(String[] args) {
		String str = "3[ab]2[cd]";
		System.out.println(stringPattern(str));
	}

	private static String stringPattern(String str) {
		StringBuilder result = new StringBuilder(); // Use StringBuilder for efficient concatenation.
        Pattern pattern = Pattern.compile("(\\d+)\\[([a-zA-Z]+)\\]"); // Matches (number)[characters]

        Matcher matcher = pattern.matcher(str);
        
		while(matcher.find()){
			int count = Integer.parseInt(matcher.group(1)); // Extract the repetition count.
            String toRepeat = matcher.group(2); // Extract the string to be repeated.

            for (int i = 0; i < count; i++) {
                result.append(toRepeat);
            }
        }

        return result.toString();
	}

}
