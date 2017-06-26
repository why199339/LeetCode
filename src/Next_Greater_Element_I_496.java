import java.util.HashMap;
import java.util.Stack;

public class Next_Greater_Element_I_496 {

	public static void main(String[] args) {

	}

	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		Stack<Integer> stack = new Stack<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			while (!stack.isEmpty() && stack.peek() < nums[i]) {
				int cur = stack.pop();
				map.put(cur, nums[i]);
			}
			stack.push(nums[i]);
		}
		while (!stack.isEmpty()) {
			int cur = stack.pop();
			map.put(cur, -1);
		}
		int[] res = new int[findNums.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = map.get(findNums[i]);
		}
		return res;
	}
}
