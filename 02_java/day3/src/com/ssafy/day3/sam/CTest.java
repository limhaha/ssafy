package com.ssafy.day3.sam;

public class CTest {

	public static void main(String[] args) {
//		Student1 s = new Student1("이하림", 29);
//		System.out.println(s.toString());
//		System.out.println(s);
//		
//		Data d = new Data(4,6);

		Student1 st1 = new Student1(2, "홍길동", 3);
		Student1 st2 = getStudent();
		System.out.println(st1 == st2); // 자바는 연산자 재정의를 지원하지 않는다.
		System.out.println(st1.equals(st2));
		System.out.println("st1 : " + st1.hashCode());
		System.out.println("st2 : " + st2.hashCode());

//		System.out.println(st1==getStudent());
//		System.out.println(st1==st2);
	}

	static Student1 getStudent() {
		Student1 s = new Student1(2, "홍동", 3);
//		return new Student1(2, "홍길동", 3);
		return s;
	}

//	static class Data{
//		int x, y;
//
//		public Data(int x, int y) {
//			this.x = x;
//			this.y = y;
//		}
//
//		@Override
//		public String toString() {
//			return "Data [x=" + x + ", y=" + y + "]";
//		}
//	}

}

// 클래스의 풀네임 com.ssafy.days.sam.Student1
class Student1 extends Object {
	private int studentNum;
	private String name;
	private int age;

	// 기본생성자는 만들어지지 않는다.
	public Student1(int studentNum, String name, int age) {
		super();
		this.studentNum = studentNum;
		this.name = name;
		this.age = age;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if (obj instanceof Student1) {
			Student1 temp = (Student1) obj;
			flag = this.studentNum == temp.studentNum;
		}
		// short circuit (짧은 단위의 논리연산)
		flag = flag && hashCode() == obj.hashCode();
		return flag;

	}
	
	

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum;
	}

	@Override
	public String toString() {
		return "Student1 [studentNum=" + studentNum + ", name=" + name + ", age=" + age + "]";
	}

}
