package com.ssafy.supplement.day0729.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test12 {
	public static void main(String[] args) {
		write();
//		read();
	}

	private static void write() {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("a", "홍길동"));
		list.add(new User("b", "김진"));
		list.add(new User("c", "한준"));

		try (FileOutputStream fos = new FileOutputStream("c:/SSAFY/supplement/test12user.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(list); // 직렬화
			System.out.println("등록 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void read() {
		// 읽기
		try {
			FileInputStream fis = new FileInputStream("c:/SSAFY/supplement/test12user.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			// 역직렬화
			ArrayList<User> list = (ArrayList<User>) ois.readObject();
			for (User user : list) {
				System.out.println("id : " + user.getId() + ", pass : " + user.getPass());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
