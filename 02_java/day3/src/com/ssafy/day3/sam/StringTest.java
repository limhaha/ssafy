package com.ssafy.day3.sam;


public class StringTest {

	public static void main(String[] args) {
		// String 불변의 원칙 
		
		String s1 = "ssafy";
		String s2 = "ssafy";
		String s3 = new String("ssafy");
		String s4 = "ssafy";
		
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s3));
		
		String name = getName();
		System.out.println(name=="홍길동");
//		if(name != null) {
//			System.out.println(name.equals("홍길동"));
//		}else {
//			System.out.println("이름이 다름");
//		}
		System.out.println("홍길동".equals(name));
	}
	
	static String getName() {
		return null;
	}

}
