
public class House_Robber_II_213 {

	public static void main(String[] args) {

	}

	public int rob(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
	}

	public int rob(int[] nums, int start, int end) {
		int preYes = 0;
		int preNo = 0;
		for (int i = start; i <= end; i++) {
			int curYes = preNo + nums[i];
			int curNo = Math.max(preNo, preYes);
			preNo = curNo;
			preYes = curYes;
		}
		return Math.max(preYes, preNo);
	}
}
