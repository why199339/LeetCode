import java.util.ArrayList;
import java.util.List;

public class Combinations_77 {

	public static void main(String[] args) {
		int n = 4;
		int k = 2;
		System.out.println(combine(n, k));
	}

	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> list = new ArrayList<>();
		backtrack(list, new ArrayList<Integer>(), n, k, 1);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, ArrayList<Integer> temp, int n, int remain, int start) {
		if (remain == 0) {
			list.add(new ArrayList<Integer>(temp));
		} else {
			for (int i = start; i <= n; i++) {
				if (temp.contains(i)) {
					continue;
				}
				temp.add(i);
				backtrack(list, temp, n, remain - 1, i + 1);
				temp.remove(temp.size() - 1);
			}
		}
	}
}
