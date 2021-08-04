/**
 	타입 파라미터의 제한
	 	- 클래스와 인터페이스를 동시에 제한할 경우 &를 이용해서 연결한다.
	 	    클래스(A)와 인터페이스(B) 동시 상속한 타입으로 제한하기
	 	  <T extends A & B>
 */
package com.ssafy.supplement.day0729.generic;

interface Drink {}
class Coke implements Drink {}
class Sprite implements Drink {}

interface Burger {}
class HamBurger implements Burger {}
class CheeseBurger implements Burger {}

class BurgerSet<D, B> implements Drink, Burger {}

class MixBox<T extends Drink & Burger> {}

public class Test012 {
	public static void main(String[] args) {
		MixBox<BurgerSet<Coke, HamBurger>> box4 = new MixBox<>();
	}
}




