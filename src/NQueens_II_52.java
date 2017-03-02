import java.util.HashSet;
import java.util.Set;

public class NQueens_II_52 {

	public static void main(String[] args) {

	}

	private static final Set<Integer> occupiedCols = new HashSet<Integer>();
	private static final Set<Integer> occupiedDiag1s = new HashSet<Integer>();
	private static final Set<Integer> occupiedDiag2s = new HashSet<Integer>();

	public static int totalNQueens(int n) {
		return totalNQueensHelper(0, 0, n);
	}

	private static int totalNQueensHelper(int row, int count, int n) {
		for (int col = 0; col < n; col++) {
			if (occupiedCols.contains(col))
				continue;
			int diag1 = row - col;
			if (occupiedDiag1s.contains(diag1))
				continue;
			int diag2 = row + col;
			if (occupiedDiag2s.contains(diag2))
				continue;
			// we can now place a queen here
			if (row == n - 1)
				count++;
			else {
				occupiedCols.add(col);
				occupiedDiag1s.add(diag1);
				occupiedDiag2s.add(diag2);
				count = totalNQueensHelper(row + 1, count, n);
				// recover
				occupiedCols.remove(col);
				occupiedDiag1s.remove(diag1);
				occupiedDiag2s.remove(diag2);
			}
		}

		return count;
	}

	public static int totalNQueens_1(int n) {
		if (n == 0) {
			return 0;
		}
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}
		int[] count = { 0 };
		nQueens(nums, 0, count);
		return count[0];
	}

	private static void nQueens(int[] nums, int index, int[] count) {
		if (index == nums.length - 1) {
			boolean result = true;
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					if ((j - i) == nums[j] - nums[i] || (i - j) == nums[j] - nums[i]) {
						result = false;
						break;
					}
				}
			}
			if (result) {
				count[0]++;
			}
			return;
		} else {
			for (int i = index; i < nums.length; i++) {
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
				nQueens(nums, index + 1, count);
				temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
			}
		}
	}
}
