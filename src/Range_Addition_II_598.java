
public class Range_Addition_II_598 {

	public static void main(String[] args) {

	}

	public int maxCount(int m, int n, int[][] ops) {
		int min_x = m;
		int min_y = n;
		for (int[] op : ops) {
			int x = op[0];
			int y = op[1];
			min_x = Math.min(min_x, x);
			min_y = Math.min(min_y, y);
		}
		return min_x * min_y;
	}
}
