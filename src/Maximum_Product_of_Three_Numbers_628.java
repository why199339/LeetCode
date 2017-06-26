import java.util.Arrays;

public class Maximum_Product_of_Three_Numbers_628 {

	public static void main(String[] args) {

	}

	// O(N*logN), O(logN)
	public int maximumProduct_sort(int[] nums) {
		Arrays.sort(nums);
		return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
				nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
	}

	// O(N), O(1)
	public int maximumProduct_best(int[] nums) {
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		for (int num : nums) {
			if (num < min1) {
				min2 = min1;
				min1 = num;
			} else if (num < min2) {
				min2 = num;
			}
			if (num > max1) {
				max3 = max2;
				max2 = max1;
				max1 = num;
			} else if (num > max2) {
				max3 = max2;
				max2 = num;
			} else if (num > max3){
				max3 = num;
			}
		}
		return Math.max(min1 * min2 * max1, max1 * max2 * max3);
	}
}
