import java.util.Arrays;

public class Sort_Colors {

	public static void main(String[] args) {
		// int[] nums = { 0, 1, 0, 2, 2, 1, 0 };
		int[] nums = { 2, 2, 1, 1, 0, 0 };
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void sortColors(int[] nums) {
		int zero = 0;
		int two = nums.length - 1;
		for (int i = 0; i <= two; i++) {
			while (nums[i] == 0 && i > zero) {
				int temp = nums[i];
				nums[i] = nums[zero];
				nums[zero] = temp;
				zero++;
			}
			while (nums[i] == 2 && i < two) {
				int temp = nums[i];
				nums[i] = nums[two];
				nums[two] = temp;
				two--;
			}
		}
	}
}
