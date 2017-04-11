
public class Maximum_Product_Subarray_152 {

	public static void main(String[] args) {
		int[] nums = {2};
		System.out.println(maxProduct(nums));
	}

	public static int maxProduct(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int tempMax = nums[0];
		int tempMin = nums[0];
		int result = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < 0) {
				int temp = tempMax;
				tempMax = tempMin;
				tempMin = temp;
			}
			tempMax = Math.max(tempMax * nums[i], nums[i]);
			tempMin = Math.min(tempMin * nums[i], nums[i]);
			result = Math.max(tempMax, result);
		}
		return result;
	}
}
