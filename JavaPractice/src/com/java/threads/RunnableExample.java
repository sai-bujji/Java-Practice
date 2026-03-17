package com.java.threads;

public class RunnableExample implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<= 10; i++) {
			System.out.println("i vlue: "+i);
		}
		
	}
	
	public static void main(String ar[]) {
		System.out.println("====Runnable interface===========");
		
		Thread t = new Thread(new RunnableExample());
		
		t.start();
	}
}
