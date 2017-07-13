import java.util.Stack;

public class Add_Two_Numbers_II_445 {

	public static void main(String[] args) {

	}

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while(l1 != null) {
        	stack1.push(l1.val);
        	l1 = l1.next;
        }
        while(l2 != null) {
        	stack2.push(l2.val);
        	l2 = l2.next;
        }
        ListNode cur = null;
        ListNode prev = null;
        int sum = 0;
        int carry = 0;
        while(!stack1.isEmpty() || !stack2.isEmpty()) {
        	int num1 = stack1.isEmpty() ? 0 : stack1.pop();
        	int num2 = stack2.isEmpty() ? 0 : stack2.pop();
        	sum = num1 + num2 + carry;
        	prev = cur;
        	cur = new ListNode(sum % 10);
        	cur.next = prev;
        	carry = sum / 10;
        }
        if(carry == 1) {
        	prev = cur;
        	cur = new ListNode(1);
        	cur.next = prev;
        }
        return cur;
    }
}
