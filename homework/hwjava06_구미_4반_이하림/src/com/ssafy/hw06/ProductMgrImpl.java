package com.ssafy.hw06;

import java.util.ArrayList;
import java.util.List;

public class ProductMgrImpl implements IProductMgr {

	private List<Product> products = new ArrayList<Product>(); // 배열 대신 List유형의 컬렉션 사용

	private static IProductMgr instance = new ProductMgrImpl();

	private ProductMgrImpl() {
	}

	public static IProductMgr getInstance() {
		return instance;
	}

	@Override
	public void add(Product product) {
		products.add(product);

	}

	@Override
	public Product[] getList() {
		Product[] result = new Product[products.size()];
		return products.toArray(result);
	}

	@Override
	public Product searchBysNum(String sNum) {
		for (Product product : products) {
			if (product.getSerialNum().equals(sNum))
				return product;
		}
		return null;
	}

	@Override
	public Product[] searchByName(String name) {
		ArrayList<Product> temp = new ArrayList<Product>();
		for (Product product : products) {
			if(product.getName().contains(name)) temp.add(product);
		}
		Product[] result = new Product[temp.size()];  
		return temp.toArray(result); 			
	}

	@Override
	public TV[] getTV() {
		ArrayList<TV> temp = new ArrayList<TV>();
		for (Product product : products) {
			if (product instanceof TV) temp.add((TV) product);
		}
		TV[] result = new TV[temp.size()];
		return temp.toArray(result);
	}

	@Override
	public Product[] getRef() {
		ArrayList<Refrigerator> temp = new ArrayList<Refrigerator>();
		for (Product product : products) {
			if (product instanceof Refrigerator) temp.add((Refrigerator) product);
		}
		Refrigerator[] result = new Refrigerator[temp.size()];
		return temp.toArray(result);
	}

	@Override
	public Product[] getRefVol() {
		ArrayList<Refrigerator> temp = new ArrayList<Refrigerator>();
		for (Product product : products) {
			if (product instanceof Refrigerator && ((Refrigerator) product).getVol() >= 400
					) 
				temp.add((Refrigerator) product);
		}
		Refrigerator[] result = new Refrigerator[temp.size()];
		return temp.toArray(result);
	}

	@Override
	public Product[] getTVInches() {
		ArrayList<TV> temp = new ArrayList<TV>();
		for (Product product : products) {
			if (product instanceof TV && ((TV) product).getInches() >= 50) temp.add((TV) product);
		}
		TV[] result = new TV[temp.size()];
		return temp.toArray(result);
	}

	@Override
	public void changePrice(String serialNum, int price) {
		Product product = searchBysNum(serialNum);
		
		product.setPrice(price);
		
	}

	@Override
	public void remove(String serialNum) {
		final int size = products.size();
		for (int i = 0; i < size; ++i) {
			if (products.get(i).getSerialNum().equals(serialNum)) {
				products.remove(i);
				break;
			}
		}
	}

	@Override
	public int getTotalStockPrice() {
		int total = 0;
		for(Product product : products) {
			total += product.getStock() * product.getPrice();
		}
		return total;
	}

}
