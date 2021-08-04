package com.ssafy.supplement.day0729.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test10 {
	public static void main(String[] args) {
		try (
				FileReader fr = new FileReader("c:/SSAFY/supplement/test06.txt");
				FileWriter fw = new FileWriter("c:/SSAFY/supplement/test10bufferedcopy.txt");
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);
				) {
			
			char[] buffer = new char[1024 * 16];
			while (true) {
				int ch = br.read(buffer);
				if (ch == -1) break;
				
				bw.write(buffer, 0, ch);
			}
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}














