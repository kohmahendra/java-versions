package com.java8.exception_handling;

@FunctionalInterface
public interface CheckedExceptionHandlerConsumer<T, ExObj extends Exception> {

	public void accept(T target) throws ExObj;
}
