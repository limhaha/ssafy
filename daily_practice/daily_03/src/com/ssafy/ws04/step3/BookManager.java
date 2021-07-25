package com.ssafy.ws04.step3;

import java.util.Arrays;

public class BookManager {
	private final int MAX_SIZE = 100;
	private Book[] books;
//	private Book[] books = new Book[MAX_SIZE];

	private int size = 0;

	public BookManager() {
		books = new Book[MAX_SIZE];
	}

	public void add(Book book) {
		if (size < MAX_SIZE) {
			books[size] = book;
			size++;
		}
	}

	public void remove(String isbn) {
		for (int i = 0; i < size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				books[i] = books[size - 1]; // 마지막 위치에 있는것 넣기
				books[size-1] = null;
				size--;
				
			}
		}
	}

	public Book[] getList() {

		return Arrays.copyOfRange(books, 0, size);
//		Book[] temp = Arrays.copyOfRange(books, 0, size);
////		Book[] temp = new Book[size];
//		for(int i=0; i<temp.length; i++) {
//			temp[i] = books[i];
//		}
//		return temp;
	}

	public Book searchByIsbn(String isbn) {
		Book book = null;
		for (int i = 0; i < size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				book = books[i];
				break;
			}
		}
		return book;
	}
}
