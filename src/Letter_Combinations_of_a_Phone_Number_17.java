import java.util.LinkedList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number_17 {

	public static void main(String[] args) {
		String digits = "23";
		System.out.println(letterCombinations(digits));
	}

	public static List<String> letterCombinations(String digits) {
		LinkedList<String> ans = new LinkedList<>();
		String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		if (digits == null || digits.length() == 0) {
			return ans;
		}
		ans.add("");
		for (int i = 0; i < digits.length(); i++) {
			int x = digits.charAt(i) - '0';
			while(ans.peek().length() == i) {
				String t = ans.remove();
				for(char c : map[x].toCharArray()) {
					ans.add(t + c);
				}
			}
		}
		return ans;
	}
}
