package com.ssafy.day5.collection.asort;

//추상 메서드가 인터페이스 안에 1개만 있어야 한다.
@FunctionalInterface
interface MyInter {
	// void m1();
	int m2(int a, int b);
}

//m2를 재정의해서 두 수의 합을 구할거야 
class MyInterImpl implements MyInter {

	@Override
	public int m2(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
}

public class BTest {

	public BTest() {
		MyInter inter = new MyInterImpl();
		aa(inter, 3, 4);
		aa((a, b) -> a + b, 4, 5);
	}

	void aa(MyInter i1, int a, int b) {
		int result = i1.m2(a, b);
		System.out.println(result);
	}

	public static void main(String[] args) {
		new BTest(); // GC

	}

}
