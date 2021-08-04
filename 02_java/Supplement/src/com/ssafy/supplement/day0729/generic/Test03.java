/**
와일드 카드 형태 3가지
	- 클래스<?>
	- 클래스<? extends T> : T 포함 T의 자손 타입 가능
	- 클래스<? super T>   : T 포함 T의 조상 타입 가능
	
 */
package com.ssafy.supplement.day0729.generic;

import java.util.ArrayList;
import java.util.List;

class Box02<T> {
	private T data;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}


class Fruit {}
class Apple extends Fruit {}
class Grape extends Fruit {}
public class Test03 {
	
	public static void main(String[] args) {
		Integer i = 100;
		Number n = i;
		
//		ArrayList<Number> numberList = new ArrayList<Integer>();	// 에러발생
		List<Integer> intList2 = new ArrayList<Integer>();  // 가능
		
		// 같은 타입 문제 없음
		Box02<Fruit> fBox = new Box02<Fruit>();  
		Box02<Apple> aBox = new Box02<Apple>();
		Box02<Grape> gBox = new Box02<Grape>();
//		Box02<Fruit> fBox = new Box02<Apple>();    // 에러 발생
		
		Box02<?> box1 = new Box02<Apple>();	// 가능
		Box02<? extends Fruit> box2 = new Box02<Grape>();  // 가능
		Box02<? extends Fruit> box3 = new Box02<Apple>();  // 가능
		Box02<? super Apple> box4 = new Box02<Apple>();	// 가능
		Box02<? super Apple> box5 = new Box02<Fruit>();	// 가능
	}
}
