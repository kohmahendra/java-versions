package com.java.lambda.com.java.lambda1.anonymous;

public class Main {

    public static void main(String[] args) {
        ProductService p = new ProductService(){
            @Override
            public void m1(){
                System.out.println("Override Parent.m1()");
            }
        };

        p.m1();
    }
}
