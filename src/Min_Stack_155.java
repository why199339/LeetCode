import java.util.Stack;

public class Min_Stack_155 {

	Stack<Integer> data;
	Stack<Integer> min;

	public static void main(String[] args) {
		Min_Stack_155 minStack = new Min_Stack_155();
		minStack.push(2);
		minStack.push(0);
		minStack.push(3);
		minStack.push(0);
		System.out.println(minStack.getMin());  
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());  
		minStack.pop();
		System.out.println(minStack.getMin());  

	}

	public Min_Stack_155() {
		data = new Stack<>();
		min = new Stack<>();
    }

	public void push(int x) {
		data.push(x);
		if (min.isEmpty() || x < min.peek()) {
			min.push(x);
		} else {
			min.push(min.peek());
		}
	}
	
	public void pop() {
		if(data.isEmpty()) {
			return;
		}
        data.pop();
        min.pop();
    }
	
	public int top() {
        return data.peek();
    }
	
	public int getMin() {
        return min.peek();
    }
}
