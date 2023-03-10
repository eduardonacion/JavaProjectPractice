import java.util.Stack;

public class PrefixPostfix {

	boolean isOperator(char x) {
		switch (x) {
		case '-':
		case '+':
		case '/':
		case '*':
		case '^':
			return true;
		}
		return false;
	}

	public String convert(String expression) {

		Stack<String> stack = new Stack<String>();
		for (int i = expression.length() - 1; i >= 0; i--) {

			char c = expression.charAt(i);

			if (isOperator(c)) {
				String s1 = stack.pop();
				String s2 = stack.pop();
				String temp = s1 + s2 + c;
				stack.push(temp);
			} else {
				stack.push(c + "");
			}
		}

		String result = stack.pop();
		return result;
	}
}