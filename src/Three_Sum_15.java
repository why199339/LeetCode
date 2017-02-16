import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Three_Sum_15 {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> list = threeSum(nums);
		System.out.println(list);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> outterlist = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int remain = -nums[i];
				int low = i + 1;
				int high = nums.length - 1;
				while (low < high) {
					if (nums[low] + nums[high] == remain) {
						outterlist.add(Arrays.asList(nums[i], nums[low], nums[high]));
						while (nums[low] == nums[low + 1]) {
							low++;
						}
						while (nums[high] == nums[high - 1]) {
							high--;
						}
						low++;
						high--;
					} else if (nums[low] + nums[high] < remain) {
						low++;
					} else {
						high--;
					}
				}
			}
		}
		return outterlist;
	}
}
