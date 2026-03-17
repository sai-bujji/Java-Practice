package com.java.threads;

public class ThreadExample extends Thread {

	public void run() {
		String str = "Thread Started Running...:";
		for(int i=0; i<= 10; i++) {
			System.out.println(str+i);
		}
	}

	public static void main(String ar[]) {
		ThreadExample example1 = new ThreadExample();
		example1.start();
		ThreadExample example2 = new ThreadExample();
		example2.start();
	}
}
