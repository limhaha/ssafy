package com.ssafy.day6.io.node;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @since 2021. 7. 8.
 */
public class UseFileStream {
	public static void main(String[] args) throws IOException {
		UseFileStream st = new UseFileStream();
		st.testFile();

		 System.out.printf("buffer size: %d, time: %d%n", 100, st.fileMove(100));
		// System.out.printf("buffer size: %d, time: %d%n", 1000, st.fileMove(1000));
		// System.out.printf("buffer size: %d, time: %d%n", 10000, st.fileMove(10000));
		 System.out.printf("buffer size: %d, time: %d%n", 100000,
		 st.fileMove(100000));
		// System.out.printf("buffer size: %d, time: %d%n", 1000000,
		// st.fileMove(1000000));
	}

	private void testFile() throws IOException {
		// 절대 경로
		File temp = new File("/Users/ihalim/Documents");
		System.out.printf("존재? %b, 디렉토리? %b%n", temp.exists(), temp.isDirectory());

		// 상대경로
		File current = new File(".");
		System.out.printf("여기는 어디? %s%n", current.getCanonicalPath());

		// d:\>java -cp .;c:\SSAFY\workspace\01-StartCamp\live\bin
		// com.ssafy.day6.io.node.UseFileStream
		// c:\SSAFY\workspace\01-StartCamp\live\bin>java
		// com.ssafy.day6.io.node.UseFileStream

		// TODO: readme.txt에 접근해보자.
		URL url = UseFileStream.class.getResource("readme.txt");
		System.out.println(url.getFile());
		InputStream input = UseFileStream.class.getResourceAsStream("readme.txt");
		// END:
	}

	public long fileMove(int bufferSize) {
		long start = System.currentTimeMillis();
		File src = new File("/Users/ihalim/Downloads/Discord.dmg");
		File target = new File("/Users/ihalim/Documents/Discord.dmg");
		// TODO: bufferSize 크기의 byte []을 이용해서 src를 target에 복사하시오.
		try (FileInputStream fin = new FileInputStream(src); 
				FileOutputStream fout = new FileOutputStream(target);) {
			// 읽어서 써주자.
			byte[] buffer = new byte[bufferSize];
			int read = 0;
			while ((read = fin.read(buffer)) > 0) {
				fout.write(buffer, 0, read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// END:
		return System.currentTimeMillis() - start;
	}
}
