package com.ssafy.daily07;

import java.util.Arrays;

public class BookManager {
	private final int MAX_SIZE = 100;
	private Book[] books;
	private int cntMagazine;
	private int size = 0;

	public BookManager() {
		books = new Book[MAX_SIZE];
	}
	
	// bookManager은 하나만 필요하기 때문에 싱글 톤으로 작성
		// 1. bookManager 클래스를 private static으로 작성해서 외부접근 막고 유일 개체로 만듬
		
		private static BookManager bookmanager;
		
		// 2. 유일 개체에 접근하기 위한 메서드
		
		public static BookManager manager() {
			if (bookmanager == null ) {
				bookmanager = new BookManager();
			}
			return bookmanager;
		}
		
	public void add(Book book) {
		if (size < MAX_SIZE) {
			books[size] = book;
			if (book instanceof Magazine) {
				cntMagazine++;
			}

			size++;
		}
	}

	public void remove(String isbn) {
		for (int i = 0; i < size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				books[i] = books[size - 1]; // 마지막 위치에 있는것 넣기
				books[size - 1] = null;
				size--;

			}
		}
	}

	public Book[] getList() {

		return Arrays.copyOfRange(books, 0, size);

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

	// 제목을 넣으면 book 객체를 반환하는 리스트
	public Book[] searchByTitle(String title) {
		Book[] bks = new Book[size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (books[i].getTitle().contains(title)) {
				bks[count++] = books[i];
			}
		}
		return bks;

	}

	// 매거진이 아닌 책들만 가져오는 메서드
	public Book[] getBooks() {
		Book[] bk = new Book[size - cntMagazine];
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (books[i] instanceof Book) {
				bk[count++] = books[i];
			}

		}
		return bk;
	}

	public Book[] getMagazines() {

		Book[] bks = new Book[cntMagazine];
		int count = 0;
		for (Book b : books) {
			if (b instanceof Magazine) {
				bks[count] = b;
				count++;
			}

		}
		return bks;
	}

	public int getTotalPrice() {

		// 이런건 지역변수로해야 된다.
		int sum = 0;

		for (int i = 0; i < size; i++) {
			sum += books[i].getPrice();

		}

		return sum;
	}

	public double getPriceAvg() {
		double avg;

		avg = (float) getTotalPrice() / size;

		return avg;
	}
}
