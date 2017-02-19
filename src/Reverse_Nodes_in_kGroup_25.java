
public class Reverse_Nodes_in_kGroup_25 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode result = reverseKGroup(head, 2);
		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

	public static ListNode reverseKGroup(ListNode head, int k) {
		ListNode curr = head;
		int count = 0;
		while (curr != null && count != k) {
			curr = curr.next;
			count++;
		}
		if (count == k) {
			curr = reverseKGroup(curr, k);
			while (count > 0) {
				ListNode temp = head.next;
				head.next = curr;
				curr = head;
				head = temp;
				count--;
			}
			head = curr;
		}
		return head;
	}
}
