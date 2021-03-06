package com.ssafy.day2.s;

public class StaticTest1 {
	
	static final boolean DEBUG = true;
	
	StaticTest1(){
		Sam s;
		s = new Sam();
		
		if(DEBUG) {
			System.out.println("디버깅 작업에서만 실행");
		}
		
		System.out.println("end");
	}
	public static void main(String[] args) {
		
		new StaticTest1();
	}

}
class Sam{
	static{ //static 블럭 -> 이 클래스가 로딩되는 시점에서 실행되는 구문 
		System.out.println("클래스가 로딩됨");
	}
	{
		System.out.println("instance 블럭");
	}
	Sam(){
		System.out.println("생성자");
	}
	Sam(int a){
		System.out.println("int 생성자");
	}
	static void m1() {
		System.out.println("m1");
	}
}