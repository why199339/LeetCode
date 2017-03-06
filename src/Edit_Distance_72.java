
public class Edit_Distance_72 {

	public static void main(String[] args) {

	}

	// O(m*n), O(m) or O(n)
	public static int minDistance_1(String word1, String word2) {
		int m = word1.length(), n = word2.length();
		int[] cur = new int[m + 1];
		cur[0] = 0;
		for (int i = 1; i <= m; i++)
			cur[i] = i;
		for (int j = 1; j <= n; j++) {
			int pre = cur[0];
			cur[0] = j;
			for (int i = 1; i <= m; i++) {
				int temp = cur[i];
				if (word1.charAt(i - 1) == word2.charAt(j - 1))
					cur[i] = pre;
				else
					cur[i] = Math.min(pre + 1, Math.min(cur[i] + 1, cur[i - 1] + 1));
				pre = temp;
			}
		}
		return cur[m];
	}

	// O(m*n), O(m*n)
	public static int minDistance_2(String word1, String word2) {
		int m = word1.length();
		int n = word2.length();
		int[][] dp = new int[m + 1][n + 1];
		dp[0][0] = 0;
		for (int j = 1; j < n + 1; j++) {
			dp[0][j] = j;
		}
		for (int i = 1; i < m + 1; i++) {
			dp[i][0] = i;
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
				}
			}
		}
		return dp[m][n];
	}
}
