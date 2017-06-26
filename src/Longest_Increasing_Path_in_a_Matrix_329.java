
public class Longest_Increasing_Path_in_a_Matrix_329 {

	public static void main(String[] args) {

	}

	int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	public int longestIncreasingPath(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return 0;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] cache = new int[m][n];
		int maxLen = 1;
		for (int i = 0; i < m ; i++) {
			for (int j = 0; j < n; j++) {
				int len = dfs(matrix, i, j, m, n, cache);
				maxLen = Math.max(maxLen, len);
			}
		}
		return maxLen;
	}

	private int dfs(int[][] matrix, int i, int j, int m, int n, int[][] cache) {
		if (cache[i][j] != 0) {
			return cache[i][j];
		}
		int maxLen = 1;
		for (int[] dir : dirs) {
			int x = i + dir[0];
			int y = j + dir[1];
			if (x < 0 || x >= m || y < 0 || y >= n || matrix[i][j] >= matrix[x][y]) {
				continue;
			}
			int len = 1 + dfs(matrix, x, y, m, n, cache);
			maxLen = Math.max(len, maxLen);
		}
		cache[i][j] = maxLen;
		return maxLen;
	}
}
