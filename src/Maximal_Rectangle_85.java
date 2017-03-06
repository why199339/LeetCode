import java.util.Stack;

public class Maximal_Rectangle_85 {

	public static void main(String[] args) {
		char[][] matrix = {};
		System.out.println(maximalRectangle(matrix));
	}

	public static int maximalRectangle(char[][] matrix) {
		if(matrix == null || matrix.length == 0) {
			return 0;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		int[] h = new int[n];
		int ret = 0;
		for (int i = 0; i < m; i++) {
			Stack<Integer> stack = new Stack<>();
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == '0') {
					h[j] = 0;
				} else {
					h[j] += 1;
				}
				if (stack.isEmpty() || h[j] > stack.peek()) {
					stack.push(h[j]);
				} else {
					int count = 0;
					while (!stack.isEmpty() && h[j] < stack.peek()) {
						count++;
						ret = Math.max(ret, stack.peek() * count);
						stack.pop();
					}
					while (count > 0) {
						stack.push(h[j]);
						count--;
					}
					stack.push(h[j]);
				}
			}
			int count = 1;
			while (!stack.isEmpty()) {
				ret = Math.max(ret, stack.peek() * count);
				stack.pop();
				count++;
			}
		}
		return ret;
	}
}
