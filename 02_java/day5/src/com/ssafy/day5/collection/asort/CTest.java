package com.ssafy.day5.collection.asort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CTest {

	class Person implements Comparable<Person>{
		int age;
		String name;
		public Person() {}
		
		public Person(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}

		@Override
		public String toString() {
			return "[age=" + age + ", name=" + name + "]";
		}

		@Override
		public int compareTo(Person other) {
			// 이름
			return name.compareTo(other.name);
		}
		
	}
	
	public CTest() {
		List<Person> list = new ArrayList<>();
		list.add(new Person(20, "홍길동"));
		list.add(new Person(30, "홍길동"));
		list.add(new Person(29, "이하림"));
		list.add(new Person(29, "윤은정"));
		System.out.println(list);
		Collections.sort(list, (o1, o2) -> o1.age - o2.age);
		System.out.println(list);
	}
	public static void main(String[] args) {
		new CTest();
		

	}

}
