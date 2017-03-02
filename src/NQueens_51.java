import java.util.ArrayList;
import java.util.List;

public class NQueens_51 {

	public static void main(String[] args) {
		List<List<String>> list = solveNQueens(4);
		System.out.println(list);
	}

	public static List<List<String>> solveNQueens(int n) {
		if (n == 0) {
			return new ArrayList<>();
		}
		int index = 0;
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = i;
		}
		List<List<String>> list = new ArrayList<>();
		solveNQueens(nums, index, list);
		return list;
	}

	private static void solveNQueens(int[] nums, int index, List<List<String>> list) {
		if (index == nums.length - 1) {
			boolean isResult = true;
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					if ((i - j) == nums[i] - nums[j] || (j - i) == nums[i] - nums[j]) {
						isResult = false;
						break;
					}
				}
			}
			if (isResult) {
				List<String> innerList = new ArrayList<>();
				for (int i = 0; i < nums.length; i++) {
					StringBuffer bf = new StringBuffer();
					for (int j = 0; j < nums.length; j++) {
						if (nums[i] == j) {
							bf.append("Q");
						} else {
							bf.append(".");
						}
					}
					innerList.add(new String(bf));
				}
				list.add(innerList);
			} else {
				return;
			}

		} else {
			for (int i = index; i < nums.length; i++) {
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
				solveNQueens(nums, index + 1, list);
				temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
			}
		}
	}
}
