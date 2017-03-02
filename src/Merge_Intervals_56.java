import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals_56 {

	public static void main(String[] args) {
		Interval i1 = new Interval(1, 3);
		Interval i2 = new Interval(2, 6);
		Interval i3 = new Interval(8, 10);
		Interval i4 = new Interval(15, 18);
		List<Interval> intervals = new ArrayList<>();
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
		intervals.add(i4);
		List<Interval> result = merge(intervals);
		for (Interval i : result) {
			System.out.println("[" + i.start + "," + i.end + "]");
		}

	}

	public static List<Interval> merge(List<Interval> intervals) {
		if (intervals == null) {
			return null;
		}
		if (intervals.size() <= 1) {
			return intervals;
		}
		Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval i1, Interval i2) {
				if (i1.start != i2.start) {
					return i1.start - i2.start;
				}
				return i1.end - i2.end;
			}
		});
		List<Interval> result = new ArrayList<>();
		int start = intervals.get(0).start;
		int end = intervals.get(0).end;
		for (Interval interval : intervals) {
			if (interval.start <= end) {
				end = Math.max(interval.end, end);
			} else {
				result.add(new Interval(start, end));
				start = interval.start;
				end = interval.end;
			}
		}
		result.add(new Interval(start, end));
		return result;
	}
}
