import java.util.Stack;

public class Remove_K_Digits_402 {

	public static void main(String[] args) {

	}

	public String removeKdigits(String num, int k) {
		if(k == num.length()) {
			return "0";
		}
		Stack<Character> stack = new Stack<>();
		for (char ch : num.toCharArray()) {
			while(k > 0 && !stack.isEmpty() && ch < stack.peek()) {
				stack.pop();
				k--;
			}
			stack.push(ch);
		}
		while (k > 0) {
			stack.pop();
			k--;
		}
		StringBuffer sb = new StringBuffer();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		sb.reverse();
		while(sb.length() > 1 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
		return sb.toString();
	}
}
