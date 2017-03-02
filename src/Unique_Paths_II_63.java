
public class Unique_Paths_II_63 {

	public static void main(String[] args) {

	}

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid[0].length;
		int[] dp = new int[m];
		dp[0] = 1;
		for (int[] row : obstacleGrid) {
			for (int j = 0; j < m; j++) {
				if (row[j] == 1) {
					dp[j] = 0;
				} else if (j > 0) {
					dp[j] += dp[j - 1];
				}
			}
		}
		return dp[m - 1];
	}
}
