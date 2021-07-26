
/*
 *  추상클래스
 *  -추상 : 구현 안된것..
 *  -abstract : 클래스 메서드, 변수(x)
 *  abstract class
 *  - 추상 클래스에는 추상 메서드가 꼭 있어야 한다. (X) 
 *  - 객체 생성이 안된다. (new 추상 클래스(X))
 *  - 활용하기 위해서는 상속을 이용해야 한다.
 *  
 *  - abstract method
 *  - method body를 구현하면 안됨...
 *  - 추상 메서드를 가지고 있는 클래스는 반드 추상클래스가 되어야 한다.(O)
 *  - 추상 클래스는 추상 메서드 + 구현된 메서드 
 *  - 추상 클래스를 상속하는 하위 클래스는 반드시 추상메서드를 재정의 해야한다.
 *  
 */

package com.ssafy.day06;
abstract class AbsSuper {
	void test() {}
	//AbsSuper aSuper = new AbsSuper();
//	abstract void call() {}
	abstract void call();
	
}
//The type AbsSub must implement the inherited abstract method AbsSuper.call()
class AbsSub extends AbsSuper{
	void call() {
		System.out.println("AbsSub의 재정의된 메서드");
	}
}
public class Test01 {

	public static void main(String[] args) {
//		AbsSuper aSuper = new AbsSuper();
		
		//형변환 발생하기 위해서는 상속관계가 되어야한다.
		AbsSuper aSuper = new AbsSub(); // 부모 = 자식 <- 묵시적 형변

		
		

	}

}
