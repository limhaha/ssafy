package com.ssafy.day2.s;

// java com.ssafy.day2.s.StaticTest -> 로딩해주세요 -> 로딩된 메소드 중에서 main 찾아서 실행
public class StaticTest {

	static int num = 10;  //클래스 변수 num 4byte
	static void doSum() { //인스턴
		
	}
	public static void main(String[] args) {
		
		doSum();
		Data.m2(); // 클래스 로딩되는 시점(한번만 로딩된다)

		Data d1; // 클래스 정적로
		d1 = new Data(); // 인스턴스화
		Data d2 = new Data();
		Data d3 = new Data();
		// side effect
		d1.a++;
		d2.a++;
		d3.a++;

		d1.b++;
		d2.b++;
		d3.b++;

		System.out.println("d1.a : " + d1.a + "  d1.b : " + d1.b);
		System.out.println("d2.a : " + d2.a + "  d2.b : " + d2.b);
		System.out.println("d3.a : " + d3.a + "  d3.b : " + d3.b);

	}

}

//static : 변수, 메소드, 클래스(innerclass에서만) 세군데에서 쓸 수 있음 
class Data {
	static int a; // static 멤버 변수 -> class 변수
	int b; // nonstatic 멤버변수 -> instance 변수

	void m1() { // 인스턴스 메소드
		System.out.println("m1");
		System.out.println(a);
		System.out.println(b);
		
	}

	static void m2() { // static메소드 -> class 메소드   static 메소드는 static변수에만 접근할수있다.
		System.out.println("m2");
		System.out.println(a);
		pr();
//		System.out.println(b);
	}

	static void pr() {
		System.out.println("pr");
	}
}