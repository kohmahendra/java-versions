package com.java8_001.lam01.annonymous;

public class AnnonymousClassExample {

	public static void main(String[] args) {
		MyInterface s = new MyInterface() {
			public void m1() {
				System.out.println("I am inside annonymous class");
			}
		};
		s.m1();// calling method
	}
}
