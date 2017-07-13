
public class Remove_Nth_Node_From_End_of_List_19 {

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode l = removeNthFromEnd(head, 2);
		while (l != null) {
			System.out.print(l.val + " ");
			l = l.next;
		}
	}

	// One pass algorithm
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    ListNode first = dummy;
	    ListNode second = dummy;
	    // Advances first pointer so that the gap between first and second is n nodes apart
	    for (int i = 1; i <= n + 1; i++) {
	        first = first.next;
	    }
	    // Move first to the end, maintaining the gap
	    while (first != null) {
	        first = first.next;
	        second = second.next;
	    }
	    second.next = second.next.next;
	    return dummy.next;
	}
	
	// Two pass algorithm
	public static ListNode removeNthFromEnd_2(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode first = head;
		int len = 0;
		while(first != null) {
			len ++;
			first = first.next;
		}
		first = dummy;
		for(int i=1; i<=len-n; i++) {
			first = first.next;
		}
		first.next = first.next.next;
		return dummy.next;
	}
	
}
