import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Different_Ways_to_Add_Parentheses_241 {

	public static void main(String[] args) {

	}

	HashMap<String, List<Integer>> map = new HashMap<>();

	public List<Integer> diffWaysToCompute(String input) {
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '+' || c == '-' || c == '*') {
				String before = input.substring(0, i);
				String after = input.substring(i + 1);
				List<Integer> l1s = map.getOrDefault(before, diffWaysToCompute(before));
				List<Integer> l2s = map.getOrDefault(after, diffWaysToCompute(after));
				for (Integer l1 : l1s) {
					for (Integer l2 : l2s) {
						int result = 0;
						switch (c) {
						case '+':
							result = l1 + l2;
							break;
						case '-':
							result = l1 - l2;
							break;
						case '*':
							result = l1 * l2;
							break;
						}
						ans.add(result);
					}
				}
			}
		}
		if (ans.size() == 0) {
			ans.add(Integer.valueOf(input));
		}
		map.put(input, ans);
		return ans;
	}
}
