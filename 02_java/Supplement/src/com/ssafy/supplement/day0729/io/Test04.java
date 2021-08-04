/**
 *   IO 클래스 형태..
 *   
 *   ----------------
 *   프로그램 메모리로 들어오는 작업 : 입력
 *   프로그램에서 내보내는 작업 : 출력
 *   
 *   추상개념의 상위 클래스
 *   
 *   내부 처리 단위에 따른 입출력 클래스 구분
 *   byte : 텍스트 편집기를 통한 해석이 불가능한것??, 해석하기 위해서 툴이 필요한 것
 *   char : 우리가 눈으로 보고 해석 가능..
 *   
 *   InputStream   - 입력 - 바이트  
 *   OutputStream  - 출력 - 바이트
 *   
 *   Reader        - 입력 - 문자
 *   Writer        - 출력 - 문자
 *   
 *   FileReader -> 문자 입력
 *   FileInputStream -> 바이트 입력
 *   FileWriter -> 문자 출력
 *   FileOutputStream -> 바이트 출력
 *   
 *   BufferedReader -> 문자 입력
 *   BufferedInputStream -> 바이트 입력
 *   BufferedWriter -> 문자 출력
 *   BufferedOutputStream -> 바이트 출력
 *   
 *   ObjectInputStream -> 바이트 입력
 *   ObjectOutputStream -> 바이트 출력
 *   
 *   PrintWriter -> 문자 출력
 *   PrintStream -> 바이트 출력
 *   
 *   InputStreamReader -> 문자 입력
 *   OutputStreamWriter -> 문자 출력
 *   ----------------
 *   
 *   프로그램에서 Person p = new Person() 객체를 생성 했습니다.
 *   이렇게 생성된 p 객체의 내용을 result.dat 파일 이름으로 저장하고 싶습니다.
 *   
 *   위의 설명에 필요한 클래스는??
 *   ObjectOutputStream, FileOutputStream
 *   
 *   A씨는 컴퓨터에 있는 이력서.doc 파일의 내용을 읽어서 이력서1.doc 파일로 복사하는 
 *   프로그램을 만들고 싶습니다.
 *   
 *   위의 설명에 필요한 클래스는??
 *   FileInputStream, FileOutputStream
 *   
 *   Test10.java 파일의 내용을 화면에 출력하는 프로그램을 작성하려고 합니다.
 *   
 *   위의 설명에 필요한 클래스는??
 *   FileReader, PrintStream
 *   
 *   
 *   사용자의 입력을 받아서 화면에 출력하는 프로그램 작성
 *   
 *   위의 설명에 필요한 클래스는??
 *   InputStream, PrintStream
 */
package com.ssafy.supplement.day0729.io;

import java.io.InputStream;

public class Test04 {
	public static void main(String[] args) {
		InputStream in = System.in;
		try {
//			{
//			System.out.println((int)'\r');
//			System.out.println((int)'\n');
//			int ch = in.read();
//			System.out.println(ch);
//		}
//		{
//			int ch = in.read();
//			System.out.println(ch);
//		}
//		{
//			int ch = in.read();
//			System.out.println(ch);
//			
//		}
			/*
			System.out.println((int)'\r');
			System.out.println((int)'\n');
			int ch = in.read();
			System.out.println(ch);
			ch = in.read();
			System.out.println(ch);
			ch = in.read();
			System.out.println(ch);
			ch = in.read();
			System.out.println(ch);
			*/
			
			while (true) {
				int ch = in.read();
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}








