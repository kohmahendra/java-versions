package com.java8_001.lam02.lamdba;

public class LambdaExample2b {
	public static void main(String[] args) {
		Runnable task = () -> {
			System.out.println("Task is running");
		};
		task.run();
	}

}
