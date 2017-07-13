
public class Find_the_Duplicate_Number_287 {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 0, 2, 5, 3 };
		System.out.println(findDuplicate_twoPointers(nums));
	}

	public static int findDuplicate_twoPointers(int[] nums) {
		if (nums == null || nums.length < 2) {
			return -1;
		}
		int slow = nums[0];
		int fast = nums[nums[0]];
		while (slow != fast) {
			slow = nums[slow];
			fast = nums[nums[fast]];
		}

		fast = 0;
		while (fast != slow) {
			fast = nums[fast];
			slow = nums[slow];
		}
		return slow;
	}

	public static int findDuplicate_binarySearch(int[] nums) {
		if (nums == null || nums.length < 2) {
			return -1;
		}
		int low = 0;
		int high = nums.length - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			int count = 0;
			for (int num : nums) {
				if (num <= mid) {
					count++;
				}
			}
			if (count > mid) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}
}
