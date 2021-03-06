package com.ssafy.day2.method;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// 클래스 배열 
		
		int[] arr = new int[5];
		
		SPerson [] brr = new SPerson[5]; //객체 배열 (객체를 실제로 생성한것이 아님)
		
//		System.out.println(arr[2]);
//		System.out.println(brr[2]);
		for(int i=0; i<brr.length; i++) {
			brr[i] = new SPerson();
			brr[i].age = 99;
		}
		
		for(int i=0; i<brr.length; i++) {
			brr[i] = new SPerson();
			brr[i].age = 77;
		}
		
		for(SPerson p : brr) {
			p.age = 22;
		}  // read only 이지만 값이 바뀜
		
		for(SPerson p : brr) {
			System.out.println(p.age);
		}
	}

}
class SPerson{
	String name;
	int age;
}