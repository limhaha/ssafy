package com.ssafy.day2.method;

public class MethodTest {
	
	// byte > short, char > int > long > float > double
	static int doSum(int a, int b) {
		int total = a+b;
		return total;
	}
	
	static int calc(int a, int b, String opt) {
		
		switch(opt) {
		case "+" :
			return a+b;
		case "*" : 
			return a*b;
		case "-" : 
			return a-b;
		case "/" : 
			return a/b;
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		
	}

}
