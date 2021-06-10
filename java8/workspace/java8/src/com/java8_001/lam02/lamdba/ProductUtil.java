package com.java8_001.lam02.lamdba;

import java.util.ArrayList;
import java.util.List;

public class ProductUtil {

	public static List<Product> getProducts() {
		List<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(1, "buckwheat", "cereals", 20, 32.50));
		prodList.add(new Product(2, "Hercules", "cereals", 20, 12.50));
		prodList.add(new Product(3, "millet", "cereals", 15, 14.60));
		prodList.add(new Product(4, "cookies cracker", "biscuit", 40, 15.00));
		prodList.add(new Product(5, "Wafer chocolate", "Wafer", 25, 23.50));
		prodList.add(new Product(6, "vanilla wafers", "Wafer", 25, 23.20));
		prodList.add(new Product(7, "favorite cookies", "biscuit", 45, 20.80));
		prodList.add(new Product(8, "ravioli", "pasta", 20, 25.00));
		prodList.add(new Product(9, "spaghetti", "pasta", 20, 27.00));
		prodList.add(new Product(10, "vermicelli", "pasta", 20, 25.00));

		prodList.add(new Product(11, "vareniki", "pasta", 20, 25.00));
		prodList.add(new Product(12, "Hercules", "cereals", 23, 55.00));
		prodList.add(new Product(13, "buckwheat", "cereals", 21, 15.00));
		prodList.add(new Product(14, "pearl barley", "cereals", 50, 78.12));
		prodList.add(new Product(15, "semolina", "cereals", 12, 75.00));
		prodList.add(new Product(16, "swallow", "cereals", 11, 12.00));
		prodList.add(new Product(17, "Karakum", "candies", 78, 2.00));
		prodList.add(new Product(18, "vermicelli", "candies", 17, 1.00));
		prodList.add(new Product(19, "leopard", "candies", 19, 8.00));
		prodList.add(new Product(20, "Mars", "candies", 2, 11.00));

		return prodList;
	}

}
