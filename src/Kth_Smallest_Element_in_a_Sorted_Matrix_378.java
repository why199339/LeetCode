import java.util.PriorityQueue;

public class Kth_Smallest_Element_in_a_Sorted_Matrix_378 {

	public static void main(String[] args) {

	}

	public int kthSmallest_heap(int[][] matrix, int k) {
		PriorityQueue<Tuple> queue = new PriorityQueue<>();
		for (int j = 0; j < matrix[0].length; j++) {
			queue.offer(new Tuple(0, j, matrix[0][j]));
		}
		for (int i = 0; i < k - 1; i++) {
			Tuple tuple = queue.poll();
			if (tuple.x == matrix.length - 1) {
				continue;
			}
			queue.offer(new Tuple(tuple.x + 1, tuple.y, matrix[tuple.x + 1][tuple.y]));
		}
		return queue.poll().val;
	}

	class Tuple implements Comparable<Tuple> {
		int x;
		int y;
		int val;

		public Tuple(int x, int y, int val) {
			this.x = x;
			this.y = y;
			this.val = val;
		}

		@Override
		public int compareTo(Tuple other) {
			return this.val - other.val;
		}

	}
}
