import javax.print.attribute.standard.NumberUpSupported;

public class Find_the_Duplicate_Number_287 {

	public static void main(String[] args) {
		int[] nums = {2, 3, 1, 0, 2, 5, 3};
		System.out.println(findDuplicate(nums));
	}

	public static int findDuplicate(int[] nums) {
		if (nums.length > 1)
		{
			int slow = nums[0];
			int fast = nums[nums[0]];
			while (slow != fast)
			{
				slow = nums[slow];
				fast = nums[nums[fast]];
			}

			fast = 0;
			while (fast != slow)
			{
				fast = nums[fast];
				slow = nums[slow];
			}
			return slow;
		}
		return -1;
	}
	
	/*
	public static int findDuplicate(int[] nums) {
        if(nums.length == 0) {
        	return -1;
        }
        int i = 0;
        while(i<nums.length) {
        	if(nums[i] == i) {
        		i++;
        		continue;
        	}
        	if(nums[i] != i && nums[i] == nums[nums[i]]) {
        		return nums[i];
        	} else {
        		int temp = nums[i];
        		nums[i] = nums[temp];
        		nums[temp] = temp;
        	}
        }
        return -1;
    }
    */
}
