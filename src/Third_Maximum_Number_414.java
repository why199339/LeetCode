
public class Third_Maximum_Number_414 {

	public static void main(String[] args) {

	}

    public int thirdMax(int[] nums) {
    	if(nums == null || nums.length == 0) {
    		return 0;
    	}
        Integer one = null;
        Integer two = null;
        Integer three = null;
        for(Integer num : nums) {
        	if(num.equals(one) || num.equals(two) || num.equals(three)) {
        		continue;
        	}
        	if(one == null || num > one) {
        		three = two;
        		two = one;
        		one = num;
        	} else if(two == null || num > two) {
        		three = two;
        		two = num;
        	} else if(three == null || num > three) {
        		three = num;
        	}
        }
        if(three == null) {
        	return one;
        }
        return three;
    }
}
