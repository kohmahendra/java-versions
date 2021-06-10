package com.java8_001.lam02.lamdba;

public class LambdaExample1 {

	public static void main(String[] args) {
		Runnable action = new Runnable() {
			@Override
			public void run() {
				System.out.println("run method");
			}
		};
		action.run();
		
		Runnable action2 = () ->System.out.println("run method");
		action2.run();

	}
	
	public void m1(){
        System.out.println("hello");
    }


}
