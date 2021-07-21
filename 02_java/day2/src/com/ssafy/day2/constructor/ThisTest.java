package com.ssafy.day2.constructor;

public class ThisTest {

	public static void main(String[] args) {
		AData data = new AData();

		data.m1();
	}

}

//class Super{
//	int su;
//}

class AData {
	String name;
	int age;
	int su = 10;

	void m1() {
		int su = 20; // 로컬 variable안에 없으면 멤버 변수를 찾는다
		System.out.println("su : " + su);
		System.out.println("su : " + this.su); // this 자기자신부터 부모를 모두 검색해서 찾음

	}

	void aa() {
		aa(2, 4); //이름을 직접 적는
	}

	void aa(int a) {

	}

	void aa(int a, int b) {

	}

}
