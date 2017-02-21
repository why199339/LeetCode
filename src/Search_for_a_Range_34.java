import java.util.Arrays;

public class Search_for_a_Range_34 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 3, 3, 3, 4, 5, 9 };
		int target = 3;
		System.out.println(Arrays.toString(searchRange_own(nums, target)));
	}

	public static int[] searchRange_best(int[] nums, int target) {
		int hi = nums.length - 1;
		int low = 0;
		int[] rs = new int[2];
		if (nums == null || nums.length == 0)
			return new int[] { -1, -1 };
		while (low < hi) {
			int mid = low + (hi - low) / 2;
			if (target > nums[mid]) {
				low = mid + 1;
			} else {
				hi = mid;
			}
		}
		if (target == nums[low]) {
			rs[0] = low;
		} else {
			rs[0] = -1;
		}
		hi = nums.length - 1;
		while (low < hi) {
			int mid = (low + (hi - low) / 2) + 1;
			if (target < nums[mid]) {
				hi = mid - 1;
			} else {
				low = mid;
			}
		}
		if (target == nums[hi]) {
			rs[1] = hi;
		} else {
			rs[1] = -1;
		}
		return rs;
	}

	public static int[] searchRange_own(int[] nums, int target) {
		if (nums == null) {
			return new int[2];
		}
		int start = -1;
		int end = -1;
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				if (mid == nums.length - 1 || nums[mid] < nums[mid + 1]) {
					end = mid;
				}
				if (mid == 0 || nums[mid] > nums[mid - 1]) {
					start = mid;
				}
				if (start == -1) {
					start = findStart(nums, low, mid - 1, target);
				}
				if (end == -1) {
					end = findEnd(nums, mid + 1, high, target);
				}
				break;
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return new int[] { start, end };
	}

	private static int findEnd(int[] nums, int low, int high, int target) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				if (mid == nums.length - 1 || nums[mid] < nums[mid + 1]) {
					return mid;
				} else {
					low = mid + 1;
				}
			} else {
				high = mid - 1;
			}

		}
		return -1;
	}

	private static int findStart(int[] nums, int low, int high, int target) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				if (mid == 0 || nums[mid] > nums[mid - 1]) {
					return mid;
				} else {
					high = mid - 1;
				}
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
