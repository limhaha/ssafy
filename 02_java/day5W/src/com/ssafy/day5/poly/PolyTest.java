package com.ssafy.day5.poly;

/*
 * 
 * 도형관리
 * 삼각형 : x, 7, x2, y2, x3, y3 drawTri()
 * 사각형 : x, y, width, height  drawRect()
 * 원 : x, y round drawCircle()
 * 그리기 기능
 */
class Shape {
	int x, y;

	void draw() {
		System.out.println("원그리기 중요하지 않");
	}
	void pr() {
		System.out.println("x : " + x + "y : " + y);
	}
	
	void add() {}
	
	
}

class Circle extends Shape {
//	int x, y;
	int round;

	void draw() {
		System.out.println("원그리기 : " + x + y + round);
	}
	void pr() {
		super.pr();
		add();
//		System.out.println("x : " + x + "y :" + y);
		System.out.println("round :" + round);
	}
}

class Rect extends Shape {
//	int x, y;
	int width, height;

	void draw() {
		System.out.println("사각형 그리기");
	}
	void pr() {
//		System.out.println("x : " + x + "y :" + y);
		System.out.println("width :" + width + "height : " + height);
	}
}

class Tri extends Shape {
//	int x, y;
	int x2, y2;
	int x3, y3;

	void draw() {
		System.out.println("삼각형 그리기");
	}
}

public class PolyTest {

	PolyTest() {
		Circle c = new Circle();
		c.x = 100;
		c.y = 200;
		c.round = 300;
		c.draw();
//		m1(c);

		Rect r = new Rect();

		r.x = 111;
		r.y = 222;
		r.width = 333;
		r.height = 333;
		r.draw();
//		m1(r);

		Tri t = new Tri();
		t.x = 122;
		t.y = 222;
		t.x2 = 322;
		t.y2 = 422;
		t.x3 = 522;
		t.y3 = 622;
		t.draw();
//		m1(t);

	}

	void m1(Shape s) {
		s.draw();
//		if (s instanceof Tri) {
//			Tri t = (Tri) s;
//			t.drawTri();
//		} else if (s instanceof Circle) {
//			Circle c = (Circle) s;
//			c.drawCircle();
//		} else if (s instanceof Rect) {
//			Rect r = (Rect) s;
//			r.drawRect();
//		}
	}

//	void m1(Object obj) {
//		if (obj instanceof Tri) {
//			Tri t = (Tri) obj;
//			t.drawTri();
//		} else if (obj instanceof Circle) {
//			Circle c = (Circle) obj;
//			c.drawCircle();
//		} else if (obj instanceof Rect) {
//			Rect r = (Rect) obj;
//			r.drawRect();
//		}
//	}
//	private void m1(Tri t) {
//		t.drawTri();
//	}
//	
//	private void m1(Rect r) {
//		r.drawRect();
//	}
//
//	void m1(Circle c) {
//		c.drawCircle();
//	}

	public static void main(String[] args) {
		new PolyTest();
	}

}
