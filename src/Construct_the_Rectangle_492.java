
public class Construct_the_Rectangle_492 {

	public static void main(String[] args) {

	}

	public int[] constructRectangle_better(int area) {
		int i = (int) Math.sqrt(area);
		while (area % i != 0) {
			i--;
		}
		return new int[] { area / i, i };
	}

	public int[] constructRectangle_own(int area) {
		int[] res = new int[2];
		int k = (int) Math.sqrt(area);
		int i = k;
		int j = k;
		while (i > 1 && j < area) {
			if (i * j == area) {
				res[0] = j;
				res[1] = i;
				break;
			}
			if (i * j < area) {
				j++;
			} else {
				i--;
			}
		}
		if (i == 1) {
			res[0] = area;
			res[1] = 1;
		}
		return res;
	}
}
