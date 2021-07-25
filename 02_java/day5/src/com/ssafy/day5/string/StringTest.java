package com.ssafy.day5.string;

public class StringTest {

	public StringTest() {
//		String str = "ssafy java test";
//		int len = str.length(); //메소드 
//		char[] crr = str.toCharArray();  //문자열을 배열로 바꾸기
//		char ch = str.charAt(3);  // 3번째 index 하나의 문자 반환 ->0
//		String s = "ssafy";
//		s.concat("java");  //스트링 객체의 분변의 원칙 
//		System.out.println(s);
//		}
	
		String ss1 = "java";
		StringBuilder sb1 = new StringBuilder("java");
		ss1 = aa(ss1);
		
		
		System.out.println(ss1);
	}

	private void aa(String ss1) {
		ss1.concat("ssafy");
		System.out.println("aa : " + ss1);
	}

	public static void main(String[] args) {
		new StringTest();

	}

}
