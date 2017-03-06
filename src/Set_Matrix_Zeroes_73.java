
public class Set_Matrix_Zeroes_73 {

	public static void main(String[] args) {

	}

	// O(m*n),O(1)
	public static void setZeroes_1(int[][] matrix) {
		int col0 = 1;
		int m = matrix.length;
		int n = matrix[0].length;
		for (int i = 0; i < m; i++) {
			if (matrix[i][0] == 0) {
				col0 = 0;
			}
			for (int j = 1; j < n; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 1; j--) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
			if (col0 == 0) {
				matrix[i][0] = 0;
			}
		}
	}

	// O(m*n), O(m+n)
	public static void setZeroes_2(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < col.length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < col.length; j++) {
				if (row[i] || col[j]) {
					matrix[i][j] = 0;
				}
			}
		}
	}
}
