import java.util.Deque;
import java.util.LinkedList;

public class Sliding_Window_Maximum_239 {

	public static void main(String[] args) {

	}

	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums == null || k <= 0 || nums.length < k) {
			return new int[0];
		}
		Deque<Integer> deque = new LinkedList<>();
		int[] result = new int[nums.length - k + 1];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
				deque.pollFirst();
			}
			while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
				deque.pollLast();
			}
			deque.offer(i);
			if (i >= k - 1) {
				result[index] = nums[deque.peekFirst()];
				index++;
			}
		}
		return result;
	}
}
