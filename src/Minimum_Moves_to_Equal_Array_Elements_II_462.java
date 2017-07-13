import java.util.Arrays;

public class Minimum_Moves_to_Equal_Array_Elements_II_462 {

	public static void main(String[] args) {

	}

	public int minMoves2(int[] nums) {
		Arrays.sort(nums);
		int i = 0;
		int j = nums.length - 1;
		int res = 0;
		while (i < j) {
			res += nums[j] - nums[i];
			i++;
			j--;
		}
		return res;
	}
}
