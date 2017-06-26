import java.util.HashMap;

public class Number_of_Boomerangs_447 {

	public static void main(String[] args) {
		
	}

	public int numberOfBoomerangs(int[][] points) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int res = 0;
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				if (i == j) {
					continue;
				}
				int d = getDistance(points[i], points[j]);
				map.put(d, map.getOrDefault(d, 0) + 1);
			}
			for (int val : map.values()) {
				res += val * (val - 1);
			}
			map.clear();
		}
		return res;
	}

	private int getDistance(int[] p1, int[] p2) {
		int x = p1[0] - p2[0];
		int y = p1[1] - p2[1];
		return x * x + y * y;
	}
}
