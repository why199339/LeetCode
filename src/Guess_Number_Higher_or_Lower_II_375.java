
public class Guess_Number_Higher_or_Lower_II_375 {

	public static void main(String[] args) {

	}

	public int getMoneyAmount(int n) {
		int[][] dp = new int[n + 1][n + 1];
		return process(dp, 1, n);
	}

	private int process(int[][] dp, int start, int end) {
		if (start >= end) {
			return 0;
		}
		if (dp[start][end] != 0) {
			return dp[start][end];
		}
		int res = Integer.MAX_VALUE;
		for (int i = start; i <= end; i++) {
			int temp = i + Math.max(process(dp, start, i - 1), process(dp, i + 1, end));
			res = Math.min(res, temp);
		}
		dp[start][end] = res;
		return res;
	}
}
