package com.ssafy.supplement.day0729.io;

import java.io.File;

public class Test03 {
	public static void main(String[] args) {
		File f = new File("/Users/ihalim/Documents/SSAFY/abcd");
		f.mkdir();
		System.out.println(
				f.renameTo(new File("/Users/ihalim/Documents/SSAFY/re-abcd"))
				? "이름 변경 성공"
				: "이름 변경 실패"		
		);
	}
}
