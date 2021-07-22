package com.ssafy.day3.sam;

/*
 * 사람, 학생, 컴퓨터, RAM
 * is(이다)
 * has (포함되다)
 * 
 * 학생은 사람이다.
 * 
 * 컴퓨터는 ram이다 (?)
 * ram은 컴퓨터이다 (?)
 * 
 * 컴퓨터는 ram을 가지고 있
 * 
 */

class Person extends Object{
	String name;
	int age;
}

class Student extends Person{
//	String name;
//	int age;
	String dept;
}

class Computer{
	String maker;
	int price;
	
	RAM ram;
	CPU cpu;
	RAN ran;
}

class RAM {
	String type;
	int size;
}

class CPU{}
class RAN{}

public class ATest {
	public static final int MAX = 999;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void aaaa() {
		
	}
}
