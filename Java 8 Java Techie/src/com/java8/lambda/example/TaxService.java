package com.java8.lambda.example;



import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

	public static List<com.java8.database.Employee> evaluateTaxUsers(String input) {
		return (input.equalsIgnoreCase("tax"))
				? com.java8.database.DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
				: com.java8.database.DataBase.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000)
						.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		System.out.println(evaluateTaxUsers("tax"));
	}
}
