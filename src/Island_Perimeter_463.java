
public class Island_Perimeter_463 {

	public static void main(String[] args) {

	}

	public int islandPerimeter(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int res = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					if (i == 0 || grid[i - 1][j] == 0) {
						res++;
					}
					if (i == m - 1 || grid[i + 1][j] == 0) {
						res++;
					}
					if (j == 0 || grid[i][j - 1] == 0) {
						res++;
					}
					if (j == n - 1 || grid[i][j + 1] == 0) {
						res++;
					}
				}
			}
		}
		return res;
	}
}
