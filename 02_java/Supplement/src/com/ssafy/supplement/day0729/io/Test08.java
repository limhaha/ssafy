package com.ssafy.supplement.day0729.io;

import java.io.FileReader;
import java.io.FileWriter;

public class Test08 {
	public static void main(String[] args) {
		try (
				FileReader fr = new FileReader("/Users/ihalim/Documents/SSAFY/test06.txt");
				FileWriter fw = new FileWriter("/Users/ihalim/Documents/SSAFY/test08copy.txt");
				) {
			while (true) {
				int ch = fr.read();
				if (ch == -1) break;
				
				fw.write(ch);
			}
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}














