import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_39 {

	public static void main(String[] args) {
		int[] candidates = {2,3,6,7};
		int target = 7;
		System.out.println(combinationSum(candidates, target));
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(candidates);
		backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, ArrayList<Integer> temp, int[] candidates, int remain, int start) {
		if (remain < 0) {
			return;
		} else if (remain == 0) {
			list.add(new ArrayList<Integer>(temp));
		} else {
			for (int i = start; i < candidates.length && remain >= candidates[i]; i++) {
				temp.add(candidates[i]);
				backtrack(list, temp, candidates, remain - candidates[i], i);
				temp.remove(temp.size() - 1);
			}
		}
	}
}
