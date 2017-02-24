
public class Jump_Game_II_45 {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 1, 4 };
		System.out.println(jump(nums));
	}

	public static int jump(int[] nums) {
		if (nums == null || nums.length < 2) {
			return 0;
		}
		int curMax = 0;
		int nextMax = 0;
		int i = 0;
		int level = 0;
		while (curMax >= i) {
			level++;
			for (; i <= curMax; i++) {
				nextMax = Math.max(nums[i] + i, nextMax);
				if (nextMax >= nums.length - 1) {
					return level;
				}
			}
			curMax = nextMax;
		}
		return 0;
	}
}
