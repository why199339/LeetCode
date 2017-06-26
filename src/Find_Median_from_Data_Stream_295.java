import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Find_Median_from_Data_Stream_295 {

	public static void main(String[] args) {

	}

	PriorityQueue<Integer> minHeap = null;
	PriorityQueue<Integer> maxHeap = null;
	boolean isEven = true;

	/** initialize your data structure here. */
	public Find_Median_from_Data_Stream_295() {
		minHeap = new PriorityQueue<>(Collections.reverseOrder());
		maxHeap = new PriorityQueue<>();
	}

	public void addNum(int num) {
		if (isEven) {
			maxHeap.offer(num);
			minHeap.offer(maxHeap.poll());
		} else {
			minHeap.offer(num);
			maxHeap.offer(minHeap.poll());
		}
		isEven = !isEven;
	}

	public double findMedian() {
		if (isEven) {
			return (minHeap.peek() + maxHeap.peek()) / 2.0;
		} else {
			return minHeap.peek();
		}
	}
}
