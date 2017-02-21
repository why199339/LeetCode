import java.util.Arrays;

public class Next_Permutation_31 {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1 };
		nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void nextPermutation(int[] nums) {
		if (nums == null) {
			return;
		}
		int i = nums.length - 2;
		while (i >= 0 && nums[i + 1] <= nums[i]) {
			i--;
		}
		if (i >= 0) {
			int j = nums.length - 1;
			while (j >= 0 && nums[j] <= nums[i]) {
				j--;
			}
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
		int start = i + 1;
		int end = nums.length - 1;
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
