
public class Rotat_Image_48 {

	public static void main(String[] args) {

	}

	public static void rotate(int[][] matrix) {
		int start = 0;
		int end = matrix[0].length - 1;
		while (start < end) {
			int[] temp = matrix[start];
			matrix[start] = matrix[end];
			matrix[end] = temp;
			start++;
			end--;
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix[0].length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
}
