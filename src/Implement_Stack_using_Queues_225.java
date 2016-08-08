import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Queues_225 {

	private static Queue<Integer> queue1 = new LinkedList<Integer>();
	private static Queue<Integer> queue2 = new LinkedList<Integer>();

	public static void main(String[] args) {
		Implement_Stack_using_Queues_225 s = new Implement_Stack_using_Queues_225();
		s.push(1);
		s.push(2);
		System.out.println(s.top());
		s.push(3);
		System.out.println(s.top());
	}

	// Push element x onto stack.
	public void push(int x) {
		queue1.offer(x);
	}

	// Removes the element on top of the stack.
	public void pop() {
		top();
		queue1.poll();
	}

	// Get the top element.
	public int top() {
		if (queue1.isEmpty()) {
			while (!queue2.isEmpty()) {
				queue1.offer(queue2.poll());
			}
		}
		while (queue1.size() != 1) {
			queue2.offer(queue1.poll());
		}
		return queue1.peek();
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return queue1.isEmpty() && queue2.isEmpty();
	}
}
