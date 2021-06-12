package com.java8_001.lam02.lamdba;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample2c1 {

	public static void main(String[] args) {
		List<Product> prodList = ProductUtil.getProducts();

		System.out.println("-----------Before Sort-----------");
		for (Product p : prodList) {
			System.out.println(p.getName());
		}
		System.out.println("-----------After Sort-----------");
		Collections.sort(prodList, new MyComparator());

		for (Product p : prodList) {
			System.out.println(p.getName());
		}

	}

}

class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
