package com.ssafy.day2.method;

public class CallTest {

	public static void main(String[] args) {
		int n = 10;
		System.out.println("n1 : " + n);
		m1(n);
		System.out.println("n2 : " + n);
		
		S s = new S();
		s.a = 9;
		System.out.println("s.a : " + s.a);
		m2(s);
		
		System.out.println("s.a : " + s.a);
	}
	
	static void m1(int n) {
		n = n + 10;
		System.out.println("m1 n : " + n);
	}
	
	static void m2(S s) {
		s.a = s.a + 10;
		System.out.println("m2 s.a" + s.a);
	}
}


class S{
	int a;
}