
public class Search_Insert_Position_35 {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 0;
		System.out.println(searchInsert(nums, target));
	}

	public static int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = low + 1;
			}
		}
		return low;
	}
}
