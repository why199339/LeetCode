import java.util.Arrays;
import java.util.Comparator;

public class Non_Overlapping_Intervals_435 {

	public static void main(String[] args) {

	}

	public static int eraseOverlapIntervals(Interval[] intervals) {
		if (intervals == null || intervals.length == 0) {
			return 0;
		}
		Arrays.sort(intervals, new MyComparator());
		int prev = 0;
		int count = 0;
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[prev].end > intervals[i].start) {
				if (intervals[prev].end > intervals[i].end) {
					prev = i;
				}
				count++;
			} else {
				prev = i;
			}
		}
		return count;
	}
}

class MyComparator implements Comparator<Interval> {

	@Override
	public int compare(Interval o1, Interval o2) {

		return o1.start - o2.start;
	}

}
