
public class H_Index_II_275 {

	public static void main(String[] args) {

	}

	public int hIndex(int[] citations) {
		int left = 0;
		int len = citations.length;
		int right = len - 1;
		int mid = left + (right - left) / 2;
		while (left <= right) {
			mid = left + (right - left) / 2;
			if (citations[mid] == (len - mid))
				return citations[mid];
			else if (citations[mid] > (len - mid))
				right = mid - 1;
			else
				left = mid + 1;
		}
		return len - (right + 1);
	}
}
