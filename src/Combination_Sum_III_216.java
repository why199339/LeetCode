import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III_216 {

	public static void main(String[] args) {
		int k = 3;
		int n = 7;
		System.out.println(combinationSum3(k, n));
	}

	public static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		backtrack(list, temp, k, n, 0, 1);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> temp, int k, int n, int sum, int start) {
		if (temp.size() == k && sum == n) {
			list.add(new ArrayList<Integer>(temp));
		} else if (temp.size() == k) {
			return;
		} else {
			for (int i = start; i <= 9; i++) {
				temp.add(i);
				backtrack(list, temp, k, n, sum + i, i + 1);
				temp.remove(temp.size() - 1);
			}
		}
	}
}
