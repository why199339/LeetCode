import java.util.List;

public class Maximum_Distance_in_Arrays_624 {

	public static void main(String[] args) {
		
	}

	public int maxDistance(List<List<Integer>> arrays) {
		int minValue = arrays.get(0).get(0);
		int maxValue = arrays.get(0).get(arrays.get(0).size() - 1);
		int res = Integer.MIN_VALUE;
		for (int i = 1; i < arrays.size(); i++) {
			res = Math.max(res,
					Math.max(Math.abs(maxValue - arrays.get(i).get(0)), Math.abs(arrays.get(i).get(arrays.get(i).size() - 1) - minValue)));
			minValue = Math.min(minValue, arrays.get(i).get(0));
			maxValue = Math.max(maxValue, arrays.get(i).get(arrays.get(i).size() - 1));
		}
		return res;
	}
}
