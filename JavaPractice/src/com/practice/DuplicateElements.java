package com.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3, 2};
		
		Set<Integer> s = new HashSet<>();
		
		for(int i=0; i< arr.length; i++) {
			for(int j=i+1; j< arr.length; j++) {
				if(arr[i] == arr[j]) {
					s.add(arr[i]);
				}
			}
		}
		
		System.out.println(s);

	}

}
