package com.java8_001.lam02.lamdba;

public class LambdaExample2b {
	public static void main(String[] args) {

		System.out.println("Main thread is- " + Thread.currentThread().getName());
		Thread t1 = new Thread(new RunnableImpl());
		t1.start();

		
		Runnable task = () -> {
			System.out.println("Task is running");
		};
		Thread t2 = new Thread(task);
		t2.start();
		
		//OR
		
		Thread t3 = new Thread(() -> {
			System.out.println("Task is running");
		});
		t3.start();

	}

}
