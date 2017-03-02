
public class Jump_Game_55 {

	public static void main(String[] args) {

	}

	public static boolean canJump(int[] nums) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		int last = nums.length - 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] + i >= last) {
				last = i;
			}
		}
		return last == 0;
	}
}
