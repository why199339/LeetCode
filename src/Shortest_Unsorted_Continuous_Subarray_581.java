
public class Shortest_Unsorted_Continuous_Subarray_581 {

	public static void main(String[] args) {

	}

	public int findUnsortedSubarray(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int min = nums[nums.length - 1];
		int left = - 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] > min) {
				left = i;
			} else {
				min = nums[i];
			}
		}
		if(left == -1) {
			return 0;
		}
		int max = nums[0];
		int right = -1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < max) {
				right = i;
			} else {
				max = nums[i];
			}
		}
		return right - left + 1;
	}
}
