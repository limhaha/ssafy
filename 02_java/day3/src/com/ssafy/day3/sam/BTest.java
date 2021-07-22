package com.ssafy.day3.sam;

class Parent extends Object {
	int su = 10;
	Parent(int a) {
		System.out.println("부모 int");
	}

	Parent() {
		System.out.println("부모 기본");
	}
	
	void pr() {
		System.out.println("부모 pr");
	}
	
	void add() {
		System.out.println("부모 추가 메소드");
	}
	
}

class Child extends Parent {
	int su = 200;
	int num = 99;
	Child() {
//		super(2);
		this(1, 2, 3);
		System.out.println("자식 기본");
	}

	Child(int a, int b, int c) {
		// 기본 super 생성자가 생략되어 있는
		System.out.println("자식 int");
	}
	@Override
	void add() {
		System.out.println("자식 추가 메소드 ");
	}
	
}

public class BTest {

	public static void main(String[] args) {
////		Child c = new Child(1, 2, 3);
////		System.out.println(c.su);
//		Parent p = new Parent();
//		System.out.println(p.su);
////		System.out.println(p.num);
//		
//		Parent p1 = new Child();
//		System.out.println(p1.su);
//		p1.pr();
//		p1.add();  //부모 변수는 자식의 추가된 메소드에 접근할 수 없다. 
		
		Parent p = new Child();
		Child c1 = (Child)p;
		System.out.println(c1.su);
		
	}

}
