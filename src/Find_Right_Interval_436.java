import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Find_Right_Interval_436 {

	public static void main(String[] args) {

	}

	public int[] findRightInterval_best(Interval[] intervals) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		int[] res = new int[intervals.length];
		for (int i = 0; i < intervals.length; i++)
			map.put(intervals[i].start, i);
		for (int i = 0; i < intervals.length; i++) {
			Integer key = map.ceilingKey(intervals[i].end);
			res[i] = key != null ? map.get(key) : -1;
		}
		return res;
	}

	public int[] findRightInterval_own(Interval[] intervals) {
		int[] start = new int[intervals.length];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < intervals.length; i++) {
			start[i] = intervals[i].start;
			map.put(intervals[i].start, i);
		}
		Arrays.sort(start);
		int[] res = new int[intervals.length];
		int i = 0;
		for (Interval interval : intervals) {
			int end = interval.end;
			int index = Arrays.binarySearch(start, end);
			if (index < 0) {
				index = -(index + 1);
			}
			if (index == intervals.length) {
				res[i++] = -1;
			} else {
				res[i++] = map.get(start[index]);
			}
		}
		return res;
	}
}
