
public class Reverse_Linked_List_II_92 {

	public static void main(String[] args) {

	}

	public static ListNode reverseBetween(ListNode head, int m, int n) {
		if (head == null) {
			return null;
		}
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode prev = dummy;
		for (int i = 0; i < m - 1; i++) {
			prev = prev.next;
		}
		ListNode start = prev.next;
		ListNode then = start.next;
		// dummy-> 1 -> 2 -> 3 -> 4 -> 5 ---> pre = 1, start = 2, then = 3
		for (int i = 0; i < n - m; i++) {
			start.next = then.next;
			then.next = prev.next;
			prev.next = then;
			then = start.next;
		}
		// first reversing : dummy->1 - 3 - 2 - 4 - 5; pre = 1, start = 2, then = 4
	    // second reversing: dummy->1 - 4 - 3 - 2 - 5; pre = 1, start = 2, then = 5 (finish)
		return dummy.next;
	}
}
