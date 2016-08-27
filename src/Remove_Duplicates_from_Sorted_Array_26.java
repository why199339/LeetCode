import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array_26 {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}

	public static int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
	
	/*
	public static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int p1 = 1;
		int p2 = 1;
		int count = 0;
		while (p1 < nums.length && p2 < nums.length) {
			if(nums[p1] > nums[p1 - 1]) {
				p1++;
			}
			if(nums[p2] == nums[p1 - 1]) {
				p2++;
			} else {
				int temp = nums[p1];
				nums[p1] = nums[p2];
				nums[p2] = temp;
				count ++;
				p1++;
				p2++;
			}
		}
		return p1;
	}
	*/
}
