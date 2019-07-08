package com.prog.LeetCodeProgs;

import java.util.Stack;

public class Problem20 {

	public static void main(String[] args) {
		
		String input = "(";
		boolean answer = isValid(input);
		System.out.println(answer);
	}

	private static boolean isValid(String input) {

		Stack<Character> stack = new Stack<Character>();
		for(char c : input.toCharArray()) {
			
			if(c == '(')
				stack.push(')');
			else if(c == '{')
				stack.push('}');
			else if(c == '[')
				stack.push(']');
			else if(stack.isEmpty() || stack.pop() != c)
				return false;
			
		}
		
		return stack.isEmpty();
	}

}
