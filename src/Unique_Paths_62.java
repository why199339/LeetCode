
public class Unique_Paths_62 {

	public static void main(String[] args) {

	}

	public static int uniquePaths_dp_1(int m, int n) {
		if (m > n) {
			return uniquePaths_dp_1(n, m);
		}
		int[] matrix = new int[m];
		for (int i = 0; i < m; i++) {
			matrix[i] = 1;
		}
		for (int j = 1; j < n; j++) {
			for (int i = 1; i < m; i++) {
				matrix[i] += matrix[i - 1];
			}
		}
		return matrix[m - 1];
	}

	public static int uniquePaths_dp_2(int m, int n) {
		int[][] matrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = 1;
			}
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
			}
		}
		return matrix[m - 1][n - 1];
	}

	public static int uniquePaths_math(int m, int n) {
		int N = m + n - 2;
		int k = m - 1;
		double res = 1;
		for (int i = 1; i <= k; i++) {
			res *= (double) (N - k + i) / i;
		}
		return (int) Math.round(res);
	}
}
