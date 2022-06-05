package core;

import java.util.Stack;

public class BalancedParentheses4 {

	static boolean isBalanced(String input) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < input.length(); i++) {
		
			char c = input.charAt(i);
			
			if (c == '(' || c == '[' || c == '{')
				stack.addElement(c);
			else if (c == ')' || c == ']' || c == '}') {
				if (stack.empty())
					return false;
				switch (c) {
				case ')':
					if (stack.pop() != '(')
						return false;
					break;
				case ']':
					if (stack.pop() != '[')
						return false;
					break;
				case '}':
					if (stack.pop() != '{')
						return false;
					break;
				default:
					return false;
				}
			}
		}
		if (stack.empty())
			return true;
		return false;
	}

	public static void main(String[] args) {
		String test = "({}) (]) {()}";
		System.out.printf("The text is %s. \n", isBalanced(test) ? "balanced" : "not balanced");
	}
}