package com.ssafy.day4.inter;

public class IronManTest {

	public static void main(String[] args) {
		Ironman iman = new IronMan();
		Object obj = iman;
		//인터페이스도 당연히 다형성이 적용될 수 있다. 
		Heroable hero = iman;
		Fightable fight = iman;
		

	}

}
