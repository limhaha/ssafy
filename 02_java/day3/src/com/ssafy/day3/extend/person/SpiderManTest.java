// ##DELETE_FILE:
package com.ssafy.day3.extend.person;

public class SpiderManTest {

	public static void main(String[] args) {
		SpiderMan sman = new SpiderMan();
		sman.isSpider = true;
		
		sman.fireWeb();
		sman.eat();
		
		
		Person p1 = new Person();
		p1.toString();
		
		//override 결과 위에 덮어씀 
		sman.jump();
//		sman.walk(10);
		
		//toString의 정체..
		System.out.println(sman.toString());
	}
	

}

