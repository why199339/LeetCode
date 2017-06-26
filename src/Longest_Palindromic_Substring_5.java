
public class Longest_Palindromic_Substring_5 {

	public static void main(String[] args) {
		String s = "babad";
		System.out.println(longestPalindrome(s));
	}

	/*
	 * Time complexity : O(n^2), Space complexity : O(1)
	 */
	public static String longestPalindrome(String s) {
		if (s.length() == 0) {
			return "";
		}
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			String s1 = expandAroundCenter(s, i, i);
			if (s1.length() > longest.length()) {
				longest = s1;
			}
			String s2 = expandAroundCenter(s, i, i + 1);
			if (s2.length() > longest.length()) {
				longest = s2;
			}
		}
		return longest;
	}

	private static String expandAroundCenter(String s, int left, int right) {
		int l = left;
		int r = right;
		while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
			l--;
			r++;
		}
		return s.substring(l + 1, r);
	}

	
	/*
	 * Dynamic Programming : Time complexity : O(n^2), Space complexity : O(n^2)
	 */
	public static String longestPalindrome_dp(String s) {
		if (s.length() == 0) {
			return "";
		}
		if (s.length() == 1) {
			return s;
		}
		boolean[][] dp = new boolean[s.length()][s.length()];
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (i >= j) {
					dp[i][j] = true;
				} else {
					dp[i][j] = false;
				}
			}
		}
		int maxLen = 1;
		int left = 0;
		int right = 0;
		for (int k = 1; k < s.length(); k++) {
			for (int i = 0; i + k < s.length(); i++) {
				int j = i + k;
				if (s.charAt(i) != s.charAt(j)) {
					dp[i][j] = false;
				} else {
					dp[i][j] = dp[i + 1][j - 1];
					if (dp[i][j]) {
						if (k + 1 > maxLen) {
							maxLen = k + 1;
							left = i;
							right = j;
						}
					}
				}
			}
		}
		return s.substring(left, right + 1);
	}
}
