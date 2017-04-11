
public class Search_a_2D_Matrix_II_240 {

	public static void main(String[] args) {

	}

	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		int row = 0;
		int col = n - 1;
		while (row < m && col >= 0) {
			if (matrix[row][col] == target) {
				return true;
			}
			if (matrix[row][col] > target) {
				col--;
			} else {
				row++;
			}
		}
		return false;
	}
}
