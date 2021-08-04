/**
	Generic Method 이해
		- <타입파라미터> 반환타입 메서드명(..)
		- 생성자에서도 사용이 가능함
		
		- 클래스 메서드 호출시
		- 클래스명.<Integer>method(100);
		
		- 인스턴스 메서드 호출시
		- 객체.<Integer>method(100);
 */
package com.ssafy.supplement.day0729.generic;


public class Test023 {
	public Test023() {}
	public <S> Test023(S s) {
		System.out.println("생성자 : " + s + ", 클래스 타입 : " + s.getClass().getName());
	}
	public static <T> void printTypeInfo(T t) {
		System.out.println("class method : " + t.getClass().getName());
	}
	public <T> void printTypeInfo2(T t) {
		System.out.println("instance method : " + t.getClass().getName());
	}
	public static void main(String[] args) {
		printTypeInfo("hello");
		printTypeInfo(1.1);  // 타입정보 알리기
		
		// 클래스 메서드 호출시 타입정보를 명시적 인지 시키기
		Test023.<Integer>printTypeInfo(100); 
		Test023.printTypeInfo(100);  
		
		Test023 test = new Test023();
		test.<Integer>printTypeInfo2(100);
		test.printTypeInfo2("hello");

		// 생성자에서도 가능함
		Test023 obj1 = new Test023(100);
		Test023 obj2 = new <Integer>Test023(100);
	}
}
