/*
 *   OutputStream  :  바이트 단위 출력
 *   Writer        :  문자 단위 출력
 */
package com.ssafy.supplement.day0729.io;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class Test06 {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("/Users/ihalim/Documents/SSAFY/test06.txt")) {
//		try (FileWriter fos = new FileWriter("c:/SSAFY/supplement/test06.txt", true)) {
			fos.write(100);  // d
			fos.write(101);  // e
			fos.write(102);  // f
			fos.write('d');  // d     int a = 'd'
			// 한글을 올바르게 쓰기 위해 Writer 클래스 필요..
			fos.write('싸');
			fos.write('피');
			System.out.println("파일 쓰기 성공~");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}






