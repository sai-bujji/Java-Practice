package com.threads;

class Thread1 implements Runnable{

	@Override
	public void run() {
		for(int i =1; i<=10; i++) {
			System.out.println("Thread name"+ Thread.currentThread().getName()+"---"+i);
		}
	}
	
}

public class JoinEx {

	public static void main(String[] args) {
		Thread t = new Thread(new Thread1());
		t.setName("Thread1");
		t.start();
		
		Thread t1 = new Thread(new Thread1());
		t1.setName("Thread2");
		t1.start();
		try {
			t1.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
