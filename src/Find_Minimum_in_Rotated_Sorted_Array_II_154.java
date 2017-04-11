
public class Find_Minimum_in_Rotated_Sorted_Array_II_154 {

	public static void main(String[] args) {

	}

	public static int findMin(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int low = 0;
		int high = nums.length - 1;
		while (low < high) {
			if (nums[low] < nums[high]) {
				return nums[low];
			}
			int mid = low + (high - low) / 2;
			if (nums[low] == nums[high] && nums[low] == nums[mid]) {
				return minInOrder(nums, low, high);
			}
			if (nums[mid] >= nums[low]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return nums[low];
	}

	private static int minInOrder(int[] nums, int low, int high) {
		int min = nums[low];
		for (int i = low; i <= high; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}
}
