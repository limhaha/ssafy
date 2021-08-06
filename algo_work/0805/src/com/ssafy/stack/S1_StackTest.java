package com.ssafy.stack;

import java.util.Stack;

public class S1_StackTest {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		System.out.println(stack.isEmpty()+ "/" + stack.size());
		
		stack.push("이하림");
		stack.push("안종혁");
		stack.push("최성환");
		stack.push("서상우");
		stack.push("형대우");
		stack.push("박준수");
		stack.push("장윤석");
		
		System.out.println(stack.isEmpty()+ "/" + stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		

		System.out.println(stack.isEmpty()+ "/" + stack.size());
		System.out.println(stack.pop());

	}

}
