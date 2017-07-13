import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Find_K_Pairs_with_Smallest_Sums_373 {

	class Pair {
		int[] pair;
		int idx; // current index to nums2
		long sum;

		Pair(int idx, int n1, int n2) {
			this.idx = idx;
			pair = new int[] { n1, n2 };
			sum = (long) n1 + (long) n2;
		}
	}

	class CompPair implements Comparator<Pair> {
		public int compare(Pair p1, Pair p2) {
			return Long.compare(p1.sum, p2.sum);
		}
	}

	public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		List<int[]> ret = new ArrayList<>();
		if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
			return ret;
		int len2 = nums2.length;
		PriorityQueue<Pair> q = new PriorityQueue<Pair>(k, new CompPair());
		for (int i = 0; i < nums1.length && i < k; i++) {
			q.offer(new Pair(0, nums1[i], nums2[0]));
		}
		for (int i = 1; i <= k && !q.isEmpty(); i++) { 
			Pair p = q.poll();
			ret.add(p.pair);
			if (p.idx < len2 - 1) { 
				int next = p.idx + 1;
				q.offer(new Pair(next, p.pair[0], nums2[next]));
			}
		}
		return ret;
	}
}
