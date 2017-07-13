import java.util.Stack;

public class Largest_Rectangle_in_Histogram_84 {

	public static void main(String[] args) {

	}

	public static int largestRectangleArea(int[] heights) {
		if (heights == null || heights.length == 0) {
			return 0;
		}
		int maxArea = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < heights.length; i++) {
			while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
				int j = stack.pop();
				int k = stack.isEmpty() ? -1 : stack.peek();
				int area = (i - k - 1) * heights[j];
				maxArea = Math.max(maxArea, area);
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			int j = stack.pop();
			int k = stack.isEmpty() ? -1 : stack.peek();
			int area = (heights.length - k - 1) * heights[j];
			maxArea = Math.max(maxArea, area);
		}
		return maxArea;
	}
}
