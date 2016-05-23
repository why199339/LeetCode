import java.util.Arrays;

public class Move_Zeroes_283 {

	public static void main(String[] args) {
		int[] nums = {0, 4, 0, 3, 12};
		System.out.println(Arrays.toString(nums));
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));

	}

//	public static void moveZeroes(int[] nums) {
//		for (int i = 0; i < nums.length; i++) {
//			if(nums[i] == 0) {
//				int j;
//				for(j = i + 1; j< nums.length; j++) {
//					if(nums[j] != 0) {
//						break;
//					}
//				}
//				if (j == nums.length) {
//					return;
//				}
//				int temp;
//				temp = nums[i];
//				nums[i] = nums[j];
//				nums[j] = temp;
//			}
//		}
//	}
	
	public static void moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0) return;        

	    int insertPos = 0;
	    for (int num: nums) {
	        if (num != 0) nums[insertPos++] = num;
	    }        

	    while (insertPos < nums.length) {
	        nums[insertPos++] = 0;
	    }
	}
}
