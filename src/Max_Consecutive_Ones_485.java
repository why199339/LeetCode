
public class Max_Consecutive_Ones_485 {

	public static void main(String[] args) {

	}

    public int findMaxConsecutiveOnes(int[] nums) {
        int cur = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++) {
        	if(nums[i] == 0) {
        		cur = 0;
        	} else {
        		cur += 1;
        	}
        	max = Math.max(max, cur);
        }
        return max;
    }
}
