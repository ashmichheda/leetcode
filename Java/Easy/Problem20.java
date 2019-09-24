public class Problem20 {

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
