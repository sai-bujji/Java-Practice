package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	public static void main(String ar[]) {
		Integer[] arr =  {1,3,5,7,9,2,4,0};
		int temp=0;
		for(int i =0; i< arr.length; i++) {
			for(int j=i; j<arr.length; j++){
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		System.out.println(Arrays.asList(arr));
	}
}
