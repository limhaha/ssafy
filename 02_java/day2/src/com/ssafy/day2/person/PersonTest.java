package com.ssafy.day2.person;

public class PersonTest {

	public static void main(String[] args) {
		//object : 유일성을 가진다. 
		
		Person person1; // 레퍼런스 변수 
		person1 = new Person(); //new -> 인스턴스화 과정 
		
		Person person2 = new Person();
		
		person1.name = "aaa";
		person1.age = 33;
		
		person2.name = "bbb";
		person2.age = 43;
		
		person1.showInfo();
		person2.showInfo();
	}
}

