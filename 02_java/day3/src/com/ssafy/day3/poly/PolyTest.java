package com.ssafy.day3.poly;

import com.ssafy.day3.extend.person.Person;
import com.ssafy.day3.extend.person.SpiderMan;

public class PolyTest {

	public static void main(String[] args) {
		
		SpiderMan sman = new SpiderMan();
		
		SpiderMan sman2 = sman;
		
		Person p = sman;
		Object obj = sman;
		
		SpiderMan sman3 = (SpiderMan)p;
		
		//부적절한 형변환 
		Person p2 = new Person();
		
		//실제 메모리에 있는 객체의 타입을 확인해보자 
		if(p2 instanceof SpiderMan) {
			SpiderMan sman4 = (SpiderMan)p2;
			sman4.fireWeb();
				
		}else {
			System.out.println("스파이더맨 아님");
		}
		
		if(p instanceof SpiderMan) {
			SpiderMan sman5 = (SpiderMan)p;
			System.out.println("스파이더맨이었군");
		}
		
		System.out.println(sman);
		System.out.println(sman.toString());
		
	}
	
}
