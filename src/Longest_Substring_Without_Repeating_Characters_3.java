import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters_3 {

	public static void main(String[] args) {
		String s1 = "abcabcbb";
		String s2 = "bbbbb";
		String s3 = "pwwkew";
		String s4 = "abba";
		System.out.println(lengthOfLongestSubstring(s1));
		System.out.println(lengthOfLongestSubstring(s2));
		System.out.println(lengthOfLongestSubstring(s3));
		System.out.println(lengthOfLongestSubstring(s4));
	}

	public static int lengthOfLongestSubstring(String s) {
		int ans = 0;
		int[] index = new int[128];
		for (int i = 0, j = 0; j < s.length(); j++) {
			i = Math.max(i, index[s.charAt(j)]);
			ans = Math.max(j - i + 1, ans);
			index[s.charAt(j)] = j + 1;
		}
		return ans;
	}

	// Sliding Window Optimized(Using HashMap) : Time complexity : O(n), Space
	// complexity (HashMap) : O(min(m,n))
	public static int lengthOfLongestSubstring2(String s) {
		int ans = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0, j = 0; j < s.length(); j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(i, map.get(s.charAt(j)));
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return ans;
	}

	// Sliding Window : Time complexity : O(2n)=O(n), Space complexity :
	// O(min(m,n))
	public static int lengthOfLongestSubstring3(String s) {
		int i = 0;
		int j = 0;
		int ans = 0;
		HashSet<Character> set = new HashSet<>();
		while (j < s.length() && i < s.length()) {
			if (set.contains(s.charAt(j))) {
				set.remove(s.charAt(i++));
			} else {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			}
		}
		return ans;
	}
}
