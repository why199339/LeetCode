import java.util.Arrays;

public class Move_Zeroes_283 {

	public static void main(String[] args) {
		int[] nums = { 0, 4, 0, 3, 12 };
		System.out.println(Arrays.toString(nums));
		moveZeroes_2(nums);
		System.out.println(Arrays.toString(nums));

	}

	public static void moveZeroes_1(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j++;
			}
		}
	}

	public static void moveZeroes_2(int[] nums) {
		if (nums == null || nums.length == 0)
			return;
		int insertPos = 0;
		for (int num : nums) {
			if (num != 0) {
				nums[insertPos] = num;
				insertPos++;
			}
		}
		while (insertPos < nums.length) {
			nums[insertPos] = 0;
			insertPos++;
		}
	}
}
