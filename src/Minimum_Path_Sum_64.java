import java.util.Arrays;

public class Minimum_Path_Sum_64 {

	public static void main(String[] args) {
		int[][] grid = { { 1, 2 }, { 2, 1 } };
		System.out.println(minPathSum(grid));
	}

	public static int minPathSum(int[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}
		int m = grid.length;
		int n = grid[0].length;
		int[][] sum = new int[m][n];
		sum[0][0] = grid[0][0];
		for (int i = 1; i < m; i++) {
			sum[i][0] = sum[i - 1][0] + grid[i][0];
		}
		for (int j = 1; j < n; j++) {
			sum[0][j] = sum[0][j - 1] + grid[0][j];
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				sum[i][j] = Math.min(sum[i - 1][j], sum[i][j - 1]) + grid[i][j];
			}
		}
		return sum[m - 1][n - 1];
	}
}
