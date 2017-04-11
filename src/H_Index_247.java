import java.util.Arrays;

public class H_Index_247 {

	public static void main(String[] args) {

	}

	public int hIndex(int[] citations) {
		int L = citations.length;
		if (L < 1)
			return 0;
		int[] counts = new int[L + 1];
		for (int i : citations) {
			if (i > L)
				counts[L]++;
			else
				counts[i]++;
		}
		int res = 0;
		for (int k = L; k >= 0; k--) {
			res += counts[k];
			if (res >= k)
				return k;
		}
		return 0;
	}
}
