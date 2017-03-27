import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning_II_132 {

	public static void main(String[] args) {

	}

	public int minCut_best(String s) {
		if (s.length() == 0)
			return 0;
		int[] c = new int[s.length() + 1];
		for (int i = 0; i < s.length(); i++)
			c[i] = Integer.MAX_VALUE;
		c[s.length()] = -1;
		for (int i = s.length() - 1; i >= 0; i--) {
			for (int a = i, b = i; a >= 0 && b < s.length() && s.charAt(a) == s.charAt(b); a--, b++)
				c[a] = Math.min(c[a], 1 + c[b + 1]);
			for (int a = i, b = i + 1; a >= 0 && b < s.length() && s.charAt(a) == s.charAt(b); a--, b++)
				c[a] = Math.min(c[a], 1 + c[b + 1]);
		}
		return c[0];
	}

	public int minCut(String s) {
		List<List<String>> list = new ArrayList<List<String>>();
		List<String> temp = new ArrayList<>();
		backtrack(list, temp, s, 0);
		int minLen = list.get(0).size();
		for (List<String> l : list) {
			if (l.size() < minLen) {
				minLen = l.size();
			}
		}
		return minLen - 1;
	}

	private void backtrack(List<List<String>> list, List<String> temp, String s, int pos) {
		if (pos == s.length()) {
			list.add(new ArrayList<String>(temp));
		} else {
			for (int i = pos; i < s.length(); i++) {
				if (isPalindrome(s, pos, i)) {
					temp.add(s.substring(pos, i + 1));
					backtrack(list, temp, s, i + 1);
					temp.remove(temp.size() - 1);
				}
			}
		}
	}

	private boolean isPalindrome(String s, int start, int end) {
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
