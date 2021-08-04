package com.ssafy.supplement.day0729.io;

import java.io.File;

public class Test02 {
	public static void main(String[] args) {
		System.out.println(File.separator);
		File f = new File("/Users/ihalim/Documents/SSAFY/20210729");
		if (f.isDirectory()) System.out.println("디렉토리임");
		if (f.isFile()) System.out.println("파일임");
		
		f = new File("/Users/ihalim/Documents/SSAFY/20210730");
		if (f.isDirectory()) System.out.println("디렉토리임");
		if (f.isFile()) System.out.println("파일임");
	}
}














