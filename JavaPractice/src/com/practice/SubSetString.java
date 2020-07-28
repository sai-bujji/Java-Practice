package com.practice;

import java.util.Arrays;

public class SubSetString {

	
	public static void main(String ar[]) {
		String str = "FUN";
		int n = str.length();
		int temp =0;
		String arr[] =  new String[n*(n+1)/2];
		
		for(int i =0;i<n;i++) {
			
			for(int j = i; j<n; j++) {
				arr[temp] = str.substring(i, j+1);
				temp++;
			}
			
		}
		
		System.out.println(Arrays.asList(arr));
	}
}
