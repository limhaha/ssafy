package com.ssafy.hw06;

public interface IProductMgr {

	void add(Product product);
	
	Product[] getList();
	
	Product searchBysNum(String sNum);
	
	Product[] searchByName(String name);
	
	Product[] getTV();
	
	Product[] getRef();
	
	Product[] getRefVol();
	//400L 이상 냉장고 검색
	
	Product[] getTVInches();
	//50인치 이상 TV 검색 
	
	void changePrice(String sNum, int price);
	// 상품번호와 가격을 입력받아 상품 가격을 변경할 수 있는 기능
	
	void remove(String serialNum);
	
	int getTotalStockPrice();
}
