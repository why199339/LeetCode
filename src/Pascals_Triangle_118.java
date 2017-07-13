import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_118 {

	public static void main(String[] args) {
		System.out.println(generate(5));
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> outter = new ArrayList<>();
		List<Integer> inner = new ArrayList<>();
		for (int i = 0; i < numRows; i++) {
			inner.add(0, 1);
			for (int j = 1; j < inner.size() - 1; j++) {
				inner.set(j, inner.get(j) + inner.get(j + 1));
			}
			outter.add(new ArrayList<>(inner));
		}
		return outter;
	}
}
