import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Valid_Parentheses_20 {

	public static void main(String[] args) {

	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c == '(') {
				stack.push(')');
			} else if (c == '{') {
				stack.push('}');
			} else if (c == '[') {
				stack.push(']');
			} else if (stack.isEmpty() || stack.pop() != c) {
				return false;
			}
		}
		return stack.isEmpty();
	}
	
	public static boolean isValid_own(String s) {
		List<Character> left = new ArrayList<>(Arrays.asList('(', '{', '['));
		List<Character> right = new ArrayList<>(Arrays.asList(')', '}', ']'));
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (left.contains(s.charAt(i))) {
				stack.push(s.charAt(i));
			} else if (right.contains(s.charAt(i))) {
				if(stack.isEmpty() || left.indexOf(stack.peek()) != right.indexOf(s.charAt(i))) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
