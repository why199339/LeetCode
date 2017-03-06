import javax.sql.rowset.serial.SerialArray;

public class Search_a_2D_Matrix_74 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
		int target = 3;
		System.out.println(searchMatrix(matrix, target));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0) {
			return false;
		}
		int row = matrix.length;
		int col = matrix[0].length;
		int start = 0;
		int end = row * col - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (matrix[mid / col][mid % col] == target) {
				return true;
			} else if (matrix[mid / col][mid % col] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}
}
