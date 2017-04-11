import java.util.Arrays;

public class Missing_Number_268 {

	public static void main(String[] args) {

	}

	public int missingNumber_xor(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res = res ^ i;
			res = res ^ nums[i];
		}
		return res ^ nums.length;
	}

	public int missingNumber_sum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += i;
			sum -= nums[i];
		}
		sum += nums.length;
		return sum;
	}

	public int missingNumber_binarySearch(int[] nums) {
		Arrays.sort(nums);
		int left = 0;
		int right = nums.length;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] > mid) {
				right = mid;
			} else {
				left = left + 1;
			}
		}
		return left;
	}
}
