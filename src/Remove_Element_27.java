
public class Remove_Element_27 {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 2, 3, 4 };
		System.out.println(removeElement1(nums, 3));
	}

	// Two Pointers - when elements to remove are rare: Time complexity : O(n),
	// Space complexity : O(1)
	public static int removeElement1(int[] nums, int val) {
		int i = 0;
		int n = nums.length;
		while (i < n) {
			if (nums[i] == val) {
				nums[i] = nums[n - 1];
				n--;
			} else {
				i++;
			}
		}
		return n;
	}

	// Two Pointers: Time complexity : O(n), Space complexity : O(1)
	public static int removeElement2(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}
}
