import java.util.Arrays;

public class Rotate_Array_189 {

	public static void main(String[] args) {
		int[] nums = { -1 };
		rotate(nums, 2);
		System.out.println(Arrays.toString(nums));
	}

	// Using Reverse : 
	public static void rotate(int[] nums, int k) {
		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	private static void reverse(int[] nums, int start, int end) {
		while(start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start ++;
			end --;
		}
	}
	
	/* Using Cyclic Replacements : Time complexity : O(n), Space complexity : O(1)
	public static void rotate(int[] nums, int k) {
		k = k % nums.length;
		int count = 0;
		for(int start = 0; count < nums.length; start++) {
			int current = start;
			int prev = nums[start];
			do {
				int next = (current + k) % nums.length;
				int temp = nums[next];
				nums[next] = prev;
				current = next;
				prev = temp;
				count ++;
			} while(current != start);
		}
	}
	*/
	
	/* Using Extra Array: Time complexity : O(n), Space complexity : O(n)
	public static void rotate(int[] nums, int k) {
		int[] a = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			a[(i + k) % nums.length] = nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = a[i];
		}
	}
	*/
	/* Brute Force [Time Limit Exceeded]: time complexity : O(n∗k), Space complexity : O(1)
	public static void rotate(int[] nums, int k) {
		if (nums == null) {
			return;
		}
		for (int i = 0; i < k; i++) {
			int temp = nums[nums.length - 1];
			for (int j = nums.length - 1; j > 0; j--) {
				nums[j] = nums[j - 1];
			}
			nums[0] = temp;
		}
	}
	*/
}
