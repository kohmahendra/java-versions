package com.java8_001.lam02.lamdba;

public class LambdaExample2a implements LambdaExample2Intr {

	@Override
	public void m1() {
		System.out.println("run method");
	}

	public static void main(String[] args) {
		LambdaExample2a inter = new LambdaExample2a();
		inter.m1();
	}

}
