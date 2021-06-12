package com.java8_001.lam02.lamdba;

public class LambdaExample2a implements LambdaExample2Intr {

	@Override
	public void m1() {
		System.out.println("m1 method implementation");
	}

	public static void main(String[] args) {
		LambdaExample2a inter = new LambdaExample2a();
		inter.m1();
		
		Thread t3 = new Thread(() ->System.out.println("Task is running"));
		t3.start();

		
	}

}
