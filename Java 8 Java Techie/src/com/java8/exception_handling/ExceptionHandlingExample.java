package com.java8.exception_handling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		// style1()

		// handle exception for checkedException
		List<Integer> list2 = Arrays.asList(10, 20);

		list2.forEach(handleCheckedExceptionConsumer(i -> {
			Thread.sleep(i);
			System.out.println(i);
		}));
	}
	// approach -2

	public static void printList(String s) {
		try {
			System.out.println(Integer.parseInt(s));
		} catch (Exception ex) {
			System.out.println("exception : " + ex.getMessage());
		}
	}

	static Consumer<String> handleExceptionIfAny(Consumer<String> payload) {
		return obj -> {
			try {
				payload.accept(obj);
			} catch (Exception ex) {
				System.out.println("exception : " + ex.getMessage());
			}
		};
	}

	static <T, ExObj extends Exception> Consumer<T> handleGenericException(Consumer<T> targetConsumer,
			Class<ExObj> exObjClass) {
		return obj -> {
			try {
				targetConsumer.accept(obj);
			} catch (Exception ex) {
				try {
					ExObj exObj = exObjClass.cast(ex);
					System.out.println("exception : " + exObj.getMessage());
				} catch (ClassCastException ecx) {
					throw ex;
				}
			}
		};
	}

	static <T> Consumer<T> handleCheckedExceptionConsumer(
			CheckedExceptionHandlerConsumer<T, Exception> handlerConsumer) {
		return obj -> {
			try {
				handlerConsumer.accept(obj);
			} catch (Exception ex) {
				throw new RuntimeException(ex);
			}
		};
	}

	public static void style1() {
		List<String> list = Arrays.asList("44", "373", "xyz");
		List<Integer> list1 = Arrays.asList(1, 0);
		list1.forEach(handleGenericException(s -> System.out.println(10 / s), ArithmeticException.class));

		list.forEach(handleGenericException(s -> System.out.println(Integer.parseInt(s)), NumberFormatException.class));

		List<Integer> intList = list.stream().map(Integer::parseInt).collect(Collectors.toList());
		System.out.println(intList);
	}
}
