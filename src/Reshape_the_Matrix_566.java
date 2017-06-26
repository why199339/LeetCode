
public class Reshape_the_Matrix_566 {

	public static void main(String[] args) {

	}

	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int m = nums.length;
		int n = nums[0].length;
		if (m * n != r * c) {
			return nums;
		}
		int[][] res = new int[r][c];
		int row = 0;
		int col = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				res[i][j] = nums[row][col];
				if (col == n - 1) {
					row++;
					col = 0;
				} else {
					col++;
				}
			}
		}
		return res;
	}
}
