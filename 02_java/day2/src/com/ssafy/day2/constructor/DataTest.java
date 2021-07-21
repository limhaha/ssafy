package com.ssafy.day2.constructor;

public class DataTest {

	public static void main(String[] args) {

//		Data d = new Data();  //이게 생성자, 인스턴스화 과정 
//		d = new Data("홍길동");
//		System.out.println(d.name);
//		d = new Data("장나라", 33);
//		System.out.println(d.name + d.age);
//		
//		d = new Data("이하림", 29, true);
//		System.out.println(d.name + d.age + d.sex);
//		
//		d.Data();
		
		Data d = new Data();
		System.out.println(d.name + " , " + d.age + " , " + d.sex);
		System.out.println("end");
	}

}


class Data{
	String name;
	int age;
	boolean sex;

//	System.out.println("이 문장은 항상 실행 ");  여기에는 명령문 불가
	{   //인스턴스블럭, 생성되기전에 실행된다, 위치는 상관없음 
		System.out.println("이 문장은 항상 실행1 ");
	}
	
	Data(){    //void가 들어가면 메소드임 (생성자가 아님!! -> 생성자는 반환타입이 없어야함)
		this("홍길동"); // this 생성자 호출은 가장 첫라인에 와야한다. 
//		name = "홍길동";
//		age = 30;
//		sex = true;
		System.out.println("기본생성자");   //메인에서 만들어지면서 호출된다 
		
	}
	
	Data(String name){ // 파라미터 변수는 무조건 로컬변수이다.
		this(name, 30);
//		this.name = name;
//		age = 30;
//		sex = true;
		System.out.println("name 전달 생성자 ");
	}
	
	Data(String name, int age){
		this(name, age, true);
//		this.name = name;
//		this.age = age;
//		sex = true;
		System.out.println("name, age 전달 생성자 ");
	}
	
	Data(String name, int age, boolean sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
		System.out.println("name, age, sex 전달 생성자 ");
	}
	
	{   //인스턴스블럭, 생성되기전에 실행된다, 위치는 상관없음 
		System.out.println("이 문장은 항상 실행2 ");
	}
}
//class Data{
//	String name;
//	int age;
//	boolean sex;
//
////	System.out.println("이 문장은 항상 실행 ");  여기에는 명령문 불가
//	{   //인스턴스블럭, 생성되기전에 실행된다, 위치는 상관없음 
//		System.out.println("이 문장은 항상 실행1 ");
//	}
//	Data(){    //void가 들어가면 메소드임 (생성자가 아님!! -> 생성자는 반환타입이 없어야함)
//		System.out.println("기본생성자");   //메인에서 만들어지면서 호출된다 
//	}
//	Data(String name){ // 파라미터 변수는 무조건 로컬변수이다.
//		this.name = name;
//		System.out.println("name 전달 생성자 ");
//	}
//	Data(String name, int age){
//		this.name = name;
//		this.age = age;
//		System.out.println("name, age 전달 생성자 ");
//	}
//	Data(String name, int age, boolean sex){
//		this.name = name;
//		this.age = age;
//		this.sex = sex;
//		System.out.println("name, age, sex 전달 생성자 ");
//	}
//	
//	{   //인스턴스블럭, 생성되기전에 실행된다, 위치는 상관없음 
//		System.out.println("이 문장은 항상 실행2 ");
//	}
//}
