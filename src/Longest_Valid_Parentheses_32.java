import java.util.Stack;

public class Longest_Valid_Parentheses_32 {

	public static void main(String[] args) {

	}

	// O(n),O(1)
	public static int longestValidParentheses_best(String s) {
		int left = 0;
		int right = 0;
		int maxLen = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				left++;
			} else {
				right++;
			}
			if (right == left) {
				maxLen = Math.max(maxLen, left + right);
			} else if (right > left) {
				left = 0;
				right = 0;
			}
		}
		left = 0;
		right = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '(') {
				left++;
			} else {
				right++;
			}
			if (right == left) {
				maxLen = Math.max(maxLen, left + right);
			} else if (right < left) {
				left = 0;
				right = 0;
			}
		}
		return maxLen;
	}

	// O(n),O(n)
	public static int longestValidParentheses_UsingStack(String s) {
		int maxans = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else {
				stack.pop();
				if (stack.empty()) {
					stack.push(i);
				} else {
					maxans = Math.max(maxans, i - stack.peek());
				}
			}
		}
		return maxans;
	}

	// O(n),O(n)
	public static int longestValidParentheses_DP(String s) {
		int maxans = 0;
		int dp[] = new int[s.length()];
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				if (s.charAt(i - 1) == '(') {
					dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
				} else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
					dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
				}
				maxans = Math.max(maxans, dp[i]);
			}
		}
		return maxans;
	}
}
