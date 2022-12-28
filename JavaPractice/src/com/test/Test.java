package com.test;

public class Test {
	static void printPattern(int lastIndex, int firstIndex, String[] ar) {
		System.out.println();
		int firstCount = 0;
		for (int i = lastIndex; i < ar.length; i++) {
			if (firstCount >= 4) {
				continue;
			}
			System.out.print(ar[i]);
			firstCount++;
		}
		for (int i = 0; i < firstIndex; i++) {
			if (firstCount >= 4) {
				continue;
			}
			System.out.print(ar[i]);
			firstCount++;
		}
	}

	public static void main(String arr[]) {
		System.out.println("ABC" + 'D' + 10);
		System.out.println(10 + 'D' + "EFG");
	}

}