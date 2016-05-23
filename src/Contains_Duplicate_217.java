import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Contains_Duplicate_217 {

	public static void main(String[] args) {

		int[] nums = {1,2,3,4,5};
		System.out.println(containsDuplicate(nums));
	}

	// Hash Table: O(n)
	public static boolean containsDuplicate(int[] nums) {
	    Set<Integer> set = new HashSet<>(nums.length);
	    for (int x: nums) {
	        if (set.contains(x)) return true;
	        set.add(x);
	    }
	    return false;
	}
	
	/*
	 * own: O(n)
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		return !(set.size() == nums.length);
	}
	*/
	
	/*
	 * sorting: O(nlogn)
	public static boolean containsDuplicate(int[] nums) {
	    Arrays.sort(nums);
	    for (int i = 0; i < nums.length - 1; ++i) {
	        if (nums[i] == nums[i + 1]) return true;
	    }
	    return false;
	}
	 */
}
