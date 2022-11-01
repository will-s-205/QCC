package core;

import java.util.Stack;

public class BalancedParentheses6 {

	public boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(') stack.push(')');
			else if (c == '{') stack.push('}');
			else if (c == '[') stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c) return false;
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String test = "{([])}";
		System.out.printf("The text is %s.\n",
				new BalancedParentheses6().isBalanced(test) ? "balansed" : "not balanced");
	}
}