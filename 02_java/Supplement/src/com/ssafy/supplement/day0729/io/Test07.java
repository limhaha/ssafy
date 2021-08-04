package com.ssafy.supplement.day0729.io;

import java.io.FileInputStream;

public class Test07 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("/Users/ihalim/Documents/SSAFY/test06.txt")) {
			while (true) {
				int ch = fis.read();
				if (ch == -1) {
					break;
				}
				System.out.print((char) ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
