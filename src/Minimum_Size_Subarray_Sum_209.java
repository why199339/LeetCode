
public class Minimum_Size_Subarray_Sum_209 {

	public static void main(String[] args) {

	}

	public int minSubArrayLen(int s, int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int i = 0;
		int j = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		while (j < nums.length) {
			sum += nums[j];
			j++;
			while (sum >= s) {
				min = Math.min(min, j - i);
				sum -= nums[i];
				i++;
			}
		}
		return min == Integer.MAX_VALUE ? 0 : min;
	}
}
