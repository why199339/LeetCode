import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II_40 {

	public static void main(String[] args) {

	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(candidates);
		backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, ArrayList<Integer> temp, int[] candidates, int remain,
			int start) {
		if (remain < 0) {
			return;
		} else if (remain == 0) {
			list.add(new ArrayList<Integer>(temp));
		} else {
			for (int i = start; i < candidates.length && candidates[i] <= remain; i++) {
				if (i > start && candidates[i] == candidates[i - 1]) {
					continue;
				}
				temp.add(candidates[i]);
				backtrack(list, temp, candidates, remain - candidates[i], i + 1);
				temp.remove(temp.size() - 1);
			}
		}
	}
}
