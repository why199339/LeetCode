import java.util.HashSet;
import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation_150 {

	public static void main(String[] args) {
		System.out.println(String.valueOf(-5));
		String[] tokens = { "4", "-2", "/", "2", "-3", "-", "-" };
		System.out.println(evalRPN(tokens));
	}

	public static int evalRPN(String[] tokens) {
		if (tokens == null || tokens.length == 0) {
			return 0;
		}
		Stack<String> stack = new Stack<>();
		HashSet<String> set = new HashSet<>();
		set.add("+");
		set.add("-");
		set.add("*");
		set.add("/");
		int result = 0;
		for (String token : tokens) {
			if (!set.contains(token)) {
				stack.push(token);
			} else {
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				if (token.equals("+")) {
					result = b + a;
				} else if (token.equals("-")) {
					result = b - a;
				} else if (token.equals("*")) {
					result = b * a;
				} else {
					result = b / a;
				}
				stack.push(String.valueOf(result));
			}
		}
		return Integer.valueOf(stack.pop());
	}
}
