import java.util.HashSet;

public class Longest_Palindrome_409 {

	public static void main(String[] args) {

	}

	public int longestPalindrome(String s) {
		HashSet<Character> set = new HashSet<>();
		int count = 0;
		for (char c : s.toCharArray()) {
			if (set.contains(c)) {
				count++;
				set.remove(c);
			} else {
				set.add(c);
			}
		}
		if (set.isEmpty()) {
			return count * 2;
		} else {
			return count * 2 + 1;
		}
	}
}
