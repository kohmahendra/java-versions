package com.java8.database;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataBase {

	public static List<Employee> getEmployees() {
		
		boolean ifStreamWay=false;
		
		if(ifStreamWay) {
			return Stream.of(
					new Employee(176, "John", "IT", 600000), 
					new Employee(388, "Peter", "Civil", 900000),
					new Employee(470, "Mark", "Electrical", 500000), 
					new Employee(624, "Kim", "Mechanical", 400000),
					new Employee(176, "Json", "Chemical", 1200000)).collect(Collectors.toList());
		}else {
			return Arrays.asList(
				new Employee(176, "John", "IT", 600000), 
				new Employee(388, "Peter", "Civil", 900000),
				new Employee(470, "Mark", "Electrical", 500000), 
				new Employee(624, "Kim", "Mechanical", 400000),
				new Employee(176, "Json", "Chemical", 1200000));
		}

	}

	public List<Book> getBooks() {
		return Arrays.asList(
				new Book(101, "Core Java", 400), 
				new Book(363, "Hibernate", 180), 
				new Book(275, "Spring", 200),
				new Book(893, "WebService", 300));
	}

}
