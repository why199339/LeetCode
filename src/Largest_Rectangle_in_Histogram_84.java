import java.util.Stack;

public class Largest_Rectangle_in_Histogram_84 {

	public static void main(String[] args) {

	}

	public static int largestRectangleArea(int[] heights) {
		int ret = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < heights.length; i++) {
			if (stack.isEmpty() || heights[i] > stack.peek()) {
				stack.push(heights[i]);
			} else {
				int count = 0;
				while (!stack.isEmpty() && heights[i] < stack.peek()) {
					count++;
					ret = Math.max(stack.peek() * count, ret);
					stack.pop();
				}
				while (count > 0) {
					stack.push(heights[i]);
					count--;
				}
				stack.push(heights[i]);
			}
		}
		int count = 1;
		while (!stack.isEmpty()) {
			ret = Math.max(ret, stack.peek() * count);
			stack.pop();
			count++;
		}
		return ret;
	}
}
