
public class Remove_Duplicates_from_Sorted_Array_II_80 {

	public static void main(String[] args) {

	}

	public static int removeDuplicates(int[] nums) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (i < 2 || nums[j] > nums[i - 2]) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}
}
