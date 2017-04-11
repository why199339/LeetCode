
public class Find_Peak_Element_162 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		System.out.println(findPeakElement_2(nums));
	}

	public static int findPeakElement_1(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			int mid1 = start + (end - start) / 2;
			int mid2 = mid1 + 1;
			if (nums[mid1] > nums[mid2]) {
				end = mid1;
			} else {
				start = mid2;
			}
		}
		return start;
	}

	public static int findPeakElement_2(int[] nums) {
		return binarySearch(nums, 0, nums.length - 1);
	}

	private static int binarySearch(int[] nums, int start, int end) {
		if (start == end) {
			return start;
		}
		if (start + 1 == end) {
			if (nums[start] > nums[end]) {
				return start;
			} else {
				return end;
			}
		}
		int mid = start + (end - start) / 2;
		if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
			return mid;
		} else if (nums[mid - 1] > nums[mid] && nums[mid] > nums[mid + 1]) {
			return binarySearch(nums, start, mid - 1);
		} else {
			return binarySearch(nums, mid + 1, end);
		}
	}
}
