import java.util.Arrays;

public class Three_Sum_Closest_16 {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2 };
		int target = 3;
		System.out.println(threeSumClosest(nums, target));
	}

	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[nums.length - 1];
		for (int i = 0; i < nums.length - 2; i++) {
			int low = i + 1;
			int high = nums.length - 1;
			while (low < high) {
				int sum = nums[i] + nums[low] + nums[high];
				if (Math.abs(sum - target) < Math.abs(result - target)) {
					result = sum;
				}
				if(sum == target) {
					return sum;
				} else if (sum > target) {
					high--;
				} else {
					low++;
				}
			}
		}
		return result;
	}
}
