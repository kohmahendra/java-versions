package com.java8.lambda.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.java8.database.Book;
import com.java8.database.DataBase;

public class BookService {

	/*
	 * ( o1, o2) -> o2.getName().compareTo(o1.getName());
	 * 
	 */
	public List<Book> getBooksinSort() {
		List<Book> books = new DataBase().getBooks();
		Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		return books;
	}

	public List<Book> getBooksSortById() {
		List<Book> books = new DataBase().getBooks();
		Collections.sort(books, Collections.reverseOrder((b1, b2) -> b1.getId().compareTo(b2.getId())));
		return books;
	}

	public static void main(String[] args) {
		// System.out.println(new BookService().getBooksinSort());
		System.out.println(new BookService().getBooksSortById());
		
		List<Integer> iList = Arrays.asList(1,5,2,8,4,9,99,45);
		System.out.println(Collections.max(iList));
	}
}

/*
 * class MyComparator implements Comparator<Book> {
 * 
 * @Override public int compare(Book o1, Book o2) { return
 * o2.getName().compareTo(o1.getName()); }
 */
