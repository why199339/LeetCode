
public class Water_and_Jug_Problem_365 {

	public static void main(String[] args) {

	}

	public boolean canMeasureWater(int x, int y, int z) {
		if (x + y < z) {
			return false;
		}
		if (x == z || y == z || x + y == z) {
			return true;
		}
		return z % GCD(x, y) == 0;
	}

	private int GCD(int x, int y) {
		while (x != 0) {
			int temp = x;
			x = y % x;
			y = temp;
		}
		return y;
	}
}
