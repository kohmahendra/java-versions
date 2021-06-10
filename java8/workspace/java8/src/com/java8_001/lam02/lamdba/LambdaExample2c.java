package com.java8_001.lam02.lamdba;

import java.util.List;

public class LambdaExample2c {

	public static void main(String[] args) {
		List<Product> prodList = ProductUtil.getProducts();

		System.out.println("-----------Before Sort-----------");
		for (Product p : prodList) {
			System.out.println(p.getName());
		}
		System.out.println("-----------After Sort-----------");
		prodList.sort((Product o1, Product o2) -> o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase()));

		for (Product p : prodList) {
			System.out.println(p.getName());
		}

	}

}
