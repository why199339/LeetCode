import java.util.Arrays;

public class Longest_Increasing_Subsequence_300 {

	public static void main(String[] args) {
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println(lengthOfLIS_1(nums));
		System.out.println(lengthOfLIS_2(nums));
	}

	// O(nlogn), O(n)
	public static int lengthOfLIS_1(int[] nums) {
		int[] dp = new int[nums.length];
		int len = 0;
		for (int x : nums) {
			int i = Arrays.binarySearch(dp, 0, len, x);
			if (i < 0)
				i = -(i + 1);
			dp[i] = x;
			if (i == len)
				len++;
		}
		return len;
	}

	// O(n^2), O(n)
	public static int lengthOfLIS_2(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int[] dp = new int[nums.length];
		int maxAns = 1;
		dp[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			int maxVal = 0;
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					maxVal = Math.max(maxVal, dp[j]);
				}
			}
			dp[i] = maxVal + 1;
			maxAns = Math.max(maxAns, dp[i]);
		}
		return maxAns;
	}
}
