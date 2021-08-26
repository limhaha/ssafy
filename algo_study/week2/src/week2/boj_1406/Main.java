package week2.boj_1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		for(char ch : input.toCharArray()) {
			left.push(ch);
		}
		
		int num = Integer.parseInt(br.readLine()); 
		
		while(num-- > 0) {
			String[] command = br.readLine().split(" ");
			if(command[0].equals("L")) {
				if(!left.isEmpty())
					right.push(left.pop());
			} 
			else if(command[0].equals("D")) {
				if(!right.isEmpty())
					left.push(right.pop());
			} 
			else if(command[0].equals("B")) {
				if(!left.isEmpty())
					left.pop();
			} 
			else if(command[0].equals("P")) {
				left.push(command[1].charAt(0));
			}
		}
		
		while(!left.isEmpty()) {
			right.push(left.pop());
		}
		
		while(!right.isEmpty()) {
			System.out.print(right.pop());
		}
		
	
	}
}