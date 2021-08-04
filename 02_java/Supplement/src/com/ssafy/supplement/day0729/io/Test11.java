package com.ssafy.supplement.day0729.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Test11 {
	public static void main(String[] args) {
		write();
//		read();
	}

	private static void read() {
		// 읽기
		ArrayList<User> list2 = new ArrayList<>();
		try (FileReader fr = new FileReader("c:/SSAFY/supplement/test11user.txt");
				BufferedReader br = new BufferedReader(fr);) {
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;

				String[] arr = line.split(":");
				User user = new User(arr[0], arr[1]);
				list2.add(user);
			}
			for (User user : list2) {
				System.out.println("id : " + user.getId() + ", name : " + user.getPass());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void write() {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("a", "홍길동"));
		list.add(new User("b", "김진"));
		list.add(new User("c", "한준"));

		try (FileWriter fw = new FileWriter("c:/SSAFY/supplement/test11user.txt")) {
			for (User u : list) {
				String id = u.getId();
				String pass = u.getPass();
				fw.write(id + ":" + pass + "\n");
			}
			System.out.println("등록 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
