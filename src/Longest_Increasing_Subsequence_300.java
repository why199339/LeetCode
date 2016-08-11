import java.util.Arrays;

public class Longest_Increasing_Subsequence_300 {

	public static void main(String[] args) {
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println(lengthOfLIS(nums));
	}

	// O(nlogn)
	public static int lengthOfLIS(int[] nums) {
		int[] dp = new int[nums.length];
        int len = 0;
        for(int x : nums) {
            int i = Arrays.binarySearch(dp, 0, len, x);
            if(i < 0) i = -(i + 1);
            dp[i] = x;
            if(i == len) len++;
        }
        return len;
	}
	
	/* O(n^2)
	public static int lengthOfLIS(int[] nums) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < arr.length; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					if (arr[j] > max) {
						max = arr[j];
					}
				}
			}
			arr[i] = max + 1;
		}
		int maxSubArray = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxSubArray) {
				maxSubArray = arr[i];
			}
//			System.out.println(i + ":" + arr[i]);
		}
		return maxSubArray;
	}
	*/
}
