import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		List<List<Integer>> list = permute_3(nums);
		System.out.println(list);
	}

	public static List<List<Integer>> permute_3(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		backtrack(list, new ArrayList<>(), nums);
		return list;
	}
	

	private static void backtrack(List<List<Integer>> list, ArrayList<Integer> temp, int[] nums) {
		if(temp.size() == nums.length) {
			list.add(new ArrayList<Integer>(temp));
		} else {
			for(int i = 0; i < nums.length; i++) {
				if(temp.contains(nums[i])) {
					continue;
				} 
				temp.add(nums[i]);
				backtrack(list, temp, nums);
				temp.remove(temp.size() - 1);
			}
		}
	}

	public static List<List<Integer>> permute_2(int[] nums) {
		if (nums == null) {
			return null;
		}
		if (nums.length == 0) {
			return new ArrayList<>();
		}
		int index = 0;
		List<List<Integer>> list = new ArrayList<>();
		permute(nums, index, list);
		return list;
	}

	private static void permute(int[] nums, int index, List<List<Integer>> list) {
		if (index == nums.length - 1) {
			List<Integer> innerList = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				innerList.add(nums[i]);
			}
			list.add(innerList);
		} else {
			for (int i = index; i < nums.length; i++) {
				int temp = nums[index];
				nums[index] = nums[i];
				nums[i] = temp;
				permute(nums, index + 1, list);
				temp = nums[index];
				nums[index] = nums[i];
				nums[i] = temp;
			}
		}
	}
	

	public static List<List<Integer>> permute_1(int[] num) {
	    List<List<Integer>> ans = new ArrayList<List<Integer>>();
	    if (num.length ==0) return ans;
	    List<Integer> l0 = new ArrayList<Integer>();
	    l0.add(num[0]);
	    ans.add(l0);
	    for (int i = 1; i< num.length; ++i){
	        List<List<Integer>> new_ans = new ArrayList<List<Integer>>(); 
	        for (int j = 0; j<=i; ++j){            
	           for (List<Integer> l : ans){
	        	   List<Integer> new_l = new ArrayList<Integer>(l);
	        	   new_l.add(j,num[i]);
	        	   new_ans.add(new_l);
	           }
	        }
	        ans = new_ans;
	    }
	    return ans;
	}

}
