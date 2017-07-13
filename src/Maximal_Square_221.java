
public class Maximal_Square_221 {

	public static void main(String[] args) {

	}

	// O(m*n), O(n)
	public int maximalSquare_dp_better(char[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return 0;
		}
		int maxLen = 0;
		int[] dp = new int[matrix[0].length + 1];
		int prev = 0;
		for (int i = 1; i < matrix.length + 1; i++) {
			for (int j = 1; j < matrix[0].length + 1; j++) {
				int temp = dp[j];
				if (matrix[i - 1][j - 1] == '1') {
					dp[j] = Math.min(Math.min(dp[j], prev), dp[j - 1]) + 1;
					maxLen = Math.max(maxLen, dp[j]);
				} else {
					dp[j] = 0;
				}
				prev = temp;
			}
		}
		return maxLen * maxLen;
	}

	// O(m*n), O(m*n)
	public int maximalSquare_dp(char[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return 0;
		}
		int maxLen = 0;
		int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
		for (int i = 1; i < matrix.length + 1; i++) {
			for (int j = 1; j < matrix[0].length + 1; j++) {
				if (matrix[i - 1][j - 1] == '1') {
					dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
					maxLen = Math.max(maxLen, dp[i][j]);
				}
			}
		}
		return maxLen * maxLen;
	}
}
