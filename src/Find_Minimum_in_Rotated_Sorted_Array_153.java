
public class Find_Minimum_in_Rotated_Sorted_Array_153 {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 4, 5, 1 };
		System.out.println(findMin(nums));
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
			if (nums[mid] >= nums[low]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return nums[low];
	}
}
