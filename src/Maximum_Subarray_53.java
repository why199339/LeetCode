
public class Maximum_Subarray_53 {

	public static void main(String[] args) {
		int[] nums = { 1, -2, 3, 10, -4, 7, 2, -5 };
		System.out.println(maxSubArray1(nums));
	}

	public static int maxSubArray1(int[] nums) {
		int maxSoFar = nums[0], maxEndingHere = nums[0];
		for (int i = 1; i < nums.length; ++i) {
			maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

	public static int maxSubArray2(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (curSum < 0) {
				curSum = nums[i];
			} else {
				curSum = curSum + nums[i];
			}
			if (curSum > maxSum) {
				maxSum = curSum;
			}
		}
		return maxSum;
	}

}
