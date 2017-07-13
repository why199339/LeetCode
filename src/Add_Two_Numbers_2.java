
public class Add_Two_Numbers_2 {

	public static void main(String[] args) {

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode p = l1;
		ListNode q = l2;
		ListNode cur = head;
		int sum = 0;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			sum = x + y + carry;
			carry = sum / 10;
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if(carry == 1) {
			cur.next = new ListNode(carry);
		}
		return head.next;
	}
}
