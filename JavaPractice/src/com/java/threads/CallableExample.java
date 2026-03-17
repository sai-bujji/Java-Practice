package com.java.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	public static void main(String ar[]) throws InterruptedException, ExecutionException {
		System.out.println("======Callable interface exaple======");
		// Create an ExecutorService with a single thread
		ExecutorService executor = Executors.newSingleThreadExecutor();

		// Create a Callable task using Lambda Expression
		Callable<Integer> task = () -> {
			System.out.println("Calculating...");
			Thread.sleep(1000);
			return 10 * 2;
		};

		// Submit the task and get a Future object
		Future<Integer> future = executor.submit(task);

		// Retrieve the result from the Future
		System.out.println("Result: " + future.get());

		// Shutdown the executor
		executor.shutdown();
	}
}
