package com.ssafy.day3.modifier;

public class TeacherTest {

	public static void main(String[] args) {
//		Teacher t1 = new Teacher();
//		Teacher t2 = new Teacher();
//		
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		System.out.println(t1 == t2);
	}

}
