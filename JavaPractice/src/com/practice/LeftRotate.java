package com.practice;

public class LeftRotate {

	public static void main(String[] args) {

		int arr[] ={1, 2, 3, 4, 5 };
		
		int a=3;
		
		for(int i=0; i<a; i++) {
			int b=arr[i];
			for(int j=0; j< arr.length-1; j++) {
				b = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = b;
			}
		}
		
		for (int i : arr) {
			System.out.print(i);
		}
	}

}
