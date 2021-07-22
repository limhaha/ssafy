package com.ssafy.day3.modifier;

public class Teacher {
	
	// 나만 만들 수 있음 
	private static Teacher t = new Teacher();
	//외부에서 생성 불가 
	private Teacher() {
	}
	
	// 이걸 통해서 가져다쓰렴 
	public static Teacher getTeacher() {
		return t;
	}
}
