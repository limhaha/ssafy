package com.ssafy.hw06;

import java.util.Arrays;

public class ProductMgr {
	final static int MAX_SIZE = 100;
	private int cntTV;
	private int cntRef;
	private Product[] products;
	private int size = 0;

	Product product = new Product();

	public ProductMgr() {
		products = new Product[MAX_SIZE];
	}

	private static ProductMgr productmgr;

	public static ProductMgr manager() {
		if (productmgr == null) {
			productmgr = new ProductMgr();
		}
		return productmgr;
	}

	// 상품정보(TV) 저장
	public void add(Product product) {
		if (size < MAX_SIZE) {
			products[size] = product;

			if (product instanceof TV) {
				cntTV++;
			}
			if (product instanceof Refrigerator) {
				cntRef++;
			}
			size++;
		}
	}

	// Refrigerator 저장
//	public void addRef(Product product) {
//		if (size < MAX_SIZE) {
//			products[size] = product;
//
//			if (product instanceof Refrigerator) {
//				cntRef++;
//			}
//			size++;
//		}
//	}

	// product 리스트 가져다주는 기능
	public Product[] getList() {
		return Arrays.copyOfRange(products, 0, size);
	}

	// 상품번호로 상품을 검색하는 기능
	public Product searchBysNum(String sNum) {
		for (int i = 0; i < size; i++) {
			if (products[i].getSerialNum().equals(sNum)) {
				product = products[i];
			}
		}
		return product;
	}

	// 상품명으로 상품을 검색하는 기능
	public Product[] searchByName(String name) {
		Product[] prd = new Product[size];
		int cnt = 0;
		for (int i = 0; i < size; i++) {
			if (products[i].getName().contains(name)) {
				prd[cnt++] = products[i];
			}
		}
		return prd;
	}

	// TV 정보만 검색
	public Product[] getTV() {
		Product[] prd = new Product[cntTV];
		int cnt = 0;
		for (Product p : products) {
			if (p instanceof TV) {
				prd[cnt] = p;
				cnt++;
			}
		}
		return prd;
	}

	// Refrigerator 정보만 검색
	public Product[] getRef() {
		Product[] product = new Product[cntRef];
		int cnt = 0;
		for (Product p : products) {
			if (p instanceof Refrigerator) {
				product[cnt] = p;
				cnt++;
			}
		}
		return product;
	}

	// 상품번호로 상품을 삭제하는 기능
	public void remove(String sNum) {
		for (int i = 0; i < size; i++) {
			if (products[i].getSerialNum().equals(sNum)) {
				products[i] = products[size - 1];
				products[size - 1] = null;
				size--;
			}
		}
	}

	// 전체 재고 상품 금액을 구하는 기능
	public int getTotalStockPrice() {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += products[i].getStock() * products[i].getPrice();
		}
		return sum;
	}

}
