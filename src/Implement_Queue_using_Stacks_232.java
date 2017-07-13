import java.util.Stack;

public class Implement_Queue_using_Stacks_232 {

	private static Stack<Integer> stack1 = new Stack<>();
	private static Stack<Integer> stack2 = new Stack<>();
	
	public static void main(String[] args) {
		
	}

	// Push element x to the back of queue.
    public static void push(int x) {
        stack1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        peek();
        stack2.pop();
    }

    // Get the front element.
    public int peek() {
    	if(stack2.isEmpty()) {
        	while(!stack1.isEmpty()) {
        		int num = stack1.pop();
        		stack2.push(num);
        	}
        }
    	return stack2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
	
}
