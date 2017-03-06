
public class Search_in_Rotated_Sorted_Array_II_81 {

	public static void main(String[] args) {
		int[] nums = { 3, 1, 1 };
		int target = 0;
		System.out.println(search(nums, target));
	}

	public static boolean search(int[] nums, int target) {
		if (nums == null) {
			return false;
		}
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				return true;
			} else if (nums[mid] > nums[low]) {
				if (target < nums[mid] && target >= nums[low]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else if (nums[mid] < nums[low]) {
				if (target <= nums[high] && target > nums[mid]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			} else {
				low ++;
			}
		}
		return false;
	}

	public static boolean search_own(int[] nums, int target) {
		if (nums == null) {
			return false;
		}
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				return true;
			} else if (high - low == 1 || (nums[mid] == nums[low] && nums[mid] == nums[high])) {
				return searchInOrder(nums, target);
			} else if (nums[mid] >= nums[low]) {
				if (target > nums[low] && target < nums[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else if (nums[mid] <= nums[high]) {
				if (target < nums[high] && target > nums[mid]) {
					low = low + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return false;
	}

	private static boolean searchInOrder(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return true;
			}
		}
		return false;
	}
}
