/*
 * 인터페이스
 *
 * -인터페이스와 추상클래스의 공통
 *  : 상속관계를 이용해서 활용
 *  : 객체 생성 직접 못함 (new 인터페이스()x)
 *  
 * -인터페이스와 추상클래스의 차이점
 *  : 추상클래스는 단일 상속 적용, 인터페이스는 다중 상속
 *  : 추상클래스는 일반 구현된 메서드 + 추상메서드, 인터페이스는 추상메서드(default, static 추가)
 *  
 *  
 * -변수 : public static final 키워드가 자동 추가
 * -메서드 : public abstract 키워드가 자동 추
 */

package com.ssafy.day06;

interface InterA {
	int MAX_VAL = 100; // public static final

	void call(); // public abstract
	default void sendMsg() {
		System.out.println("현재 지원되지 않는 기능입니다.");
	}
	static void common() {
		System.out.println("공통으로 사용하는 것들 처리");
	}
}

interface InterB {
	void print();
}

interface InterC extends InterA, InterB {

}

class InterSub implements InterA, InterB {

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	public void print() {

	}

}

public class Test02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InterA.MAX_VAL);
//		The final field InterA.MAX_VAL cannot be assigned
//		InterA.MAX_VAL = 200; // error 발생, final 성격 확인

		InterSub sub = new InterSub();
		InterA iSuper = new InterSub();

		List<String> list = new ArrayList<>();
		list = new LinkedList<>();
	}
}
