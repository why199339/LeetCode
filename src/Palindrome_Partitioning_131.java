import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning_131 {

	public static void main(String[] args) {
		System.out.println(partition("aab"));
	}

	public static List<List<String>> partition(String s) {
		List<List<String>> list = new ArrayList<List<String>>();
		List<String> temp = new ArrayList<>();
		backtrack(list, temp, s, 0);
		return list;
	}

	private static void backtrack(List<List<String>> list, List<String> temp, String s, int pos) {
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

	private static boolean isPalindrome(String s, int start, int end) {
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
