package com.threads;

import java.util.Scanner;

public class WaitAndNotify {
	public static void main(String ar[]) {
		PC pc = new PC();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				pc.resume();

			}

		});
		
		t1.start();
		t2.start();
	}

	static class PC {

		public void consume() throws InterruptedException {
			synchronized (this) {
				System.out.println("inside counsume before wait");
				wait();
				System.out.println("inside counsume after wait");
			}

		}

		public void resume() {
			synchronized (this) {
				System.out.println("inside resume before notify");
				notify();
				System.out.println("inside resume after notify");
			}

		}

	}

}
