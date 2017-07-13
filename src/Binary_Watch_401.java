import java.util.ArrayList;
import java.util.List;

public class Binary_Watch_401 {

	public static void main(String[] args) {

	}

	public List<String> readBinaryWatch(int num) {
		List<String> res = new ArrayList<String>();
		for (int h = 0; h < 12; h++) {
			for (int m = 0; m < 60; m++) {
				if (Integer.bitCount(m) + Integer.bitCount(h << 6) == num) {
					res.add(String.format("%d:%02d", h, m));
				}
			}
		}
		return res;
	}
}
