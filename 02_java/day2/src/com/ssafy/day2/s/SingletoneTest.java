package com.ssafy.day2.s;

// 디자인패턴 -> 나중에
// 싱글턴디자인 패턴 클래스가 생성된다 -> 1개만 생성되어야한다 -> 제약
// student, teacher(1명)-> 싱글턴으로 구현 

class Student {
	String name;
	int age;
	Teacher teacher;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Teacher {
	// 싱글턴 디자인 패턴을 적용
	String name;
	int depth;
	
	// 2. 내부에 현재객체를 접근할 수 있는 변수를 static으로 선언한다.
	private static Teacher teacher = null;

	private Teacher() {

	}
	// 매개변수 있는 생성자를 만들면, 기본 생성자는 만들어지지 않는다.
	// 1. 생성자를 private로 생성해 외부생성을막는다.
	private Teacher(String name, int depth) {
		this.name = name;
		this.depth = depth;
	}
	
	// 3. static 메소드로 현재 객체가 존재하지 않으면 내부 생성하고, 존재하면 그 객체를 반환하는 메소드를 만든다.
	static Teacher getInstance() { // Teacher의 인스턴스 객체를 반환하는것이 목적
		if (teacher == null) {
			teacher = new Teacher();
		}
		return teacher;

	}

	void aa() {

	}
}

public class SingletoneTest {

	public SingletoneTest() {
		Student student1 = new Student("홍길동", 20);
		Student student2 = new Student("장나라", 33);
		Student student3 = new Student("박찬호", 40);
		
//		Teacher teacher = new Teacher("김재웅", 3);
		Teacher teacher = Teacher.getInstance();
		teacher.name = "김재웅";
		
		student1.teacher = teacher;
		student2.teacher = Teacher.getInstance();  //직접 넣으면 다르다 왜냐하면 다른것이 새로 생성된것이기 떄
		
		
		
//		System.out.println(student1 == student2);
		System.out.println(student1.teacher == student2.teacher);
		System.out.println(student1.teacher.name);
		System.out.println(student2.teacher.name);
	}

	public static void main(String[] args) {
		new SingletoneTest();

	}

}
