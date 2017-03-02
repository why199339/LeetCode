
public class Spiral_Matrix_II_59 {

	public static void main(String[] args) {

	}

	public static int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		int rowStart = 0;
		int colStart = 0;
		int rowEnd = n - 1;
		int colEnd = n - 1;
		int num = 1;
		while (rowStart <= rowEnd && colStart <= colEnd) {
			for (int i = colStart; i <= colEnd; i++) {
				matrix[rowStart][i] = num;
				num++;
			}
			rowStart++;
			for (int i = rowStart; i <= rowEnd; i++) {
				matrix[i][colEnd] = num;
				num++;
			}
			colEnd--;
			for (int i = colEnd; i >= colStart; i--) {
				if (colStart <= colEnd) {
					matrix[rowEnd][i] = num;
					num++;
				}
			}
			rowEnd--;
			for (int i = rowEnd; i >= rowStart; i--) {
				if (rowStart <= rowEnd) {
					matrix[i][colStart] = num;
					num++;
				}
			}
			colStart++;
		}
		return matrix;
	}
}
