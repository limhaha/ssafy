/**
 	타입 파라미터의 제한
 	
	 	- 필요에 따라서 구체적인 타입으로 제한이 필요
	 	- Generic 타입 선언시 특정한 데이터의 타입만 받을 수 있게 하자
	 	- 형식
	 	  <T extends 제한할타입>
	 	- 인터페이스 타입으로 제한할 경우도 extends를 사용
 */
package com.ssafy.supplement.day0729.generic;

class Box<T extends Number> {
	private T data;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}

public class Test011 {
	public static void main(String[] args) {
		Box<Integer> s = new Box<>();
		Box<Double> s2 = new Box<>();
		Box<Byte> s3 = new Box<>();
		// Bound mismatch: The type String is not a valid substitute(대체) for the bounded parameter <T extends Number> of the type Bag<T>
//		Box<String> s4 = new Box<>();  // 에러
		
	}
}




