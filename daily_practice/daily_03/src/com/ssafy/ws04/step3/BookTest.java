package com.ssafy.ws04.step3;

public class BookTest {

	public static void main(String[] args) {
		BookManager manager = new BookManager();
//		BookManager manager1 = new BookManager();
//		BookManager manager2 = new BookManager();
//		BookManager manager3 = new BookManager();
//		BookManager manager4 = new BookManager();

		Book book0 = new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법");
		Book book1 = new Book("21425", "Java Pro2", "김하나", "jaen.kr", 25000, "Java 응용");
		Book book2 = new Book("35355", "분석설계", "소나무", "jaen.kr", 30000, "SW 모델링");

		manager.add(book0);
		manager.add(book1);
		manager.add(book2);

		System.out.println("****************도서목록****************");

		Book[] books = manager.getList();
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println("****************도서조회: 21424****************");
		Book book = manager.searchByIsbn("21424");
		System.out.println(book == null ? "그런책 없음" : book);
	}
}


