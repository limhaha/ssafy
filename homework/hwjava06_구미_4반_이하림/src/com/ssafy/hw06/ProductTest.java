package com.ssafy.hw06;

public class ProductTest {

	public static void main(String[] args) {
		
		IProductMgr manager = ProductMgrImpl.getInstance();
		
		Product tv1 = new TV("tv-01", "Samsung Smart TV", 2000000, 15, 75, "UHD 4K");
		Product tv2 = new TV("tv-02", "LG Smart TV", 1400000, 10, 45, "FHD");
		Product ref1 = new Refrigerator("ref-01", "LG Dios Object", 1500000, 20, 800);
		Product ref2 = new Refrigerator("ref-02", "LG Dios Object", 800000, 10, 350);
		
		manager.add(tv1);
		manager.add(tv2);
		manager.add(ref1);
		manager.add(ref2);
		
		System.out.println("<상품 조회 리스트>");
		Product[] products = manager.getList();   // 물건리스트 
		for(Product p : products) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("<상품조회 : tv-01>");
		Product product = manager.searchBysNum("tv-01");
		System.out.println(product == null ? "상품없음" : product);
		
		System.out.println();
		System.out.println("<상품조회 : LG Dios Object>");
		for(Product p : manager.searchByName("LG Dios Object")) {
			System.out.println(p);
		}
//		System.out.println(product1 == null ? "상품없음" : product1);
		
		System.out.println();
		System.out.println("<TV 조회>");
		for(Product p : manager.getTV()) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("<냉장고 조회>");
		for(Product p : manager.getRef()) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("<400L 이상의 냉장고 조회>");
		for(Product p : manager.getRefVol()) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("<50inch 이상의 TV 조회>");
		for(Product p : manager.getTVInches()) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("<tv-01 가격변경>");
		manager.changePrice("tv-01", 1900000);
		for(Product p : manager.getTV()) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("<tv-02 삭제>");
		manager.remove("tv-02");
		Product[] products2 = manager.getList();   // 물건리스트 
		for(Product p : products2) {
			System.out.println(p);
		}

		
		System.out.println();
		int price = manager.getTotalStockPrice();
		System.out.println("<전체 재고 상품 금액> : " + price + "원");
		
	}

}
