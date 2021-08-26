package com.ssafy.linkedlist;

public class StackTest {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		System.out.println(stack.isEmpty());
		stack.push("악뮤");
		System.out.println(stack);
		stack.push("아이유");
		System.out.println(stack);
		stack.push("BTS");
		System.out.println(stack);
		System.out.println(stack.isEmpty());
	}

}
