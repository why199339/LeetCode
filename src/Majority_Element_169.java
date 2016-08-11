import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Majority_Element_169 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 1, 1, 1 };
		System.out.println(majorityElement(nums));
	}

	//Moore voting algorithm
	public static int majorityElement(int[] num) {
		int major = num[0], count = 1;
		for (int i = 1; i < num.length; i++) {
			if (count == 0) {
				count++;
				major = num[i];
			} else if (major == num[i]) {
				count++;
			} else
				count--;
		}
		return major;
	}

	/*
	 * sorting
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
      	int len = nums.length;
      	return nums[len/2];
    	}
	 */
	
	/*
	 * Hash Table
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
	    //Hashtable<Integer, Integer> myMap = new Hashtable<Integer, Integer>();
	    int ret=0;
	    for (int num: nums) {
	        if (!myMap.containsKey(num))
	            myMap.put(num, 1);
	        else
	            myMap.put(num, myMap.get(num)+1);
	        if (myMap.get(num)>nums.length/2) {
	            ret = num;
	            break;
	        }
    	}
   		return ret;
	}
	*/
	
	/*
	 * Bit manipulation 
	 public int majorityElement(int[] nums) {
	    int ret = 0;
    	for (int i = 0; i < 32; i++) {
	        int ones = 0, zeros = 0;
	        for (int j = 0; j < num.length; j++) {
	            if ((num[j] & (1 << i)) != 0) {
	                ++ones;
	            }
	            else
	                ++zeros;
        	}
        }
        if (ones > zeros)
            ret |= (1 << i);
    	}
    	return ret;
	}
	 */
	
	/*
	 * own
	public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], 0);
		}
        for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
		}
        int len = nums.length;
        int result = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	if(entry.getValue() > Math.floor(len/2)) {
        		result = entry.getKey();
        	}
        }
        return result;
    }
	*/
}
