package com.ssafy.supplement.day0729.io;

import java.io.InputStreamReader;
import java.io.Reader;

public class Test05 {
	public static void main(String[] args) {
		// 한글 처리가 불가능 : byte 단위로 읽어서 바로 처리하기 때문에 ...
		// 문자 단위 처리를 이용해서 한글 처리 ...
		try (Reader in = new InputStreamReader(System.in)) {
			while (true) {
				int ch = in.read();
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}








