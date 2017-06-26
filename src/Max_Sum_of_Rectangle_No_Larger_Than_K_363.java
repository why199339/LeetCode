import java.util.Arrays;
import java.util.TreeSet;

public class Max_Sum_of_Rectangle_No_Larger_Than_K_363 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 0, 1 }, { 0, -2, 3 } };
		int k = 2;
		System.out.println(maxSumSubmatrix(matrix, k));
	}

	public static int maxSumSubmatrix(int[][] matrix, int k) {
		int row = matrix.length;
		if (row == 0)
			return 0;
		int col = matrix[0].length;
		int m = Math.min(row, col);
		int n = Math.max(row, col);
		boolean colIsBig = col > row;
		int res = Integer.MIN_VALUE;
		for (int i = 0; i < m; i++) {
			int[] array = new int[n];
			for (int j = i; j >= 0; j--) {
				int val = 0;
				TreeSet<Integer> set = new TreeSet<Integer>();
				set.add(0);
				for (int p = 0; p < n; p++) {
					array[p] = array[p] + (colIsBig ? matrix[j][p] : matrix[p][j]);
					val = val + array[p];
					Integer subres = set.ceiling(val - k);
					if (null != subres) {
						res = Math.max(res, val - subres);
					}
					set.add(val);
				}
			}
		}
		return res;
	}

	public static int maxSumSubmatrix_2(int[][] matrix, int k) {
		if (matrix == null || matrix.length == 0) {
			return 0;
		}
		int res = 0;
		for (int i = 0; i < matrix.length; i++) {
			int[] sumArr = new int[matrix[0].length];
			for (int j = i; j < matrix.length; j++) {
				for (int p = 0; p < matrix[0].length; p++) {
					sumArr[p] += matrix[j][p];
				}
				res = Math.max(res, (j - i + 1) * getMaxLen(sumArr, k));
			}
		}
		return res;
	}

	private static int getMaxLen(int[] sumArr, int k) {
		int[] h = new int[sumArr.length + 1];
		h[0] = 0;
		int sum = 0;
		for (int i = 0; i < sumArr.length; i++) {
			sum += sumArr[i];
			h[i + 1] = Math.max(sum, h[i]);
		}
		int maxLen = 0;
		int len = 0;
		sum = 0;
		int index = 0;
		for (int i = 0; i < sumArr.length; i++) {
			sum += sumArr[i];
			index = Arrays.binarySearch(h, sum - k);
			if (index < 0) {
				len = 0;
			} else {
				len = i - index + 1;
			}
			maxLen = Math.max(maxLen, len);
		}
		return maxLen;
	}
}
