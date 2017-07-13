import java.util.Stack;

public class Next_Greater_Element_II_503 {

	public static void main(String[] args) {

	}

	public int[] nextGreaterElements(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		int[] res = new int[nums.length];
		for (int i = nums.length * 2 - 1; i >= 0; i--) {
			while (!stack.isEmpty() && nums[i % nums.length] >= nums[stack.peek()]) {
				stack.pop();
			}
			res[i % nums.length] = stack.isEmpty() ? -1 : nums[stack.peek()];
			stack.push(i % nums.length);
		}
		return res;
	}
}
