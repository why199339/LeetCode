import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array_26 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}

	public static int removeDuplicates_best(int[] nums) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (i < 2 || nums[j] > nums[i - 2]) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}

}
