
public class Swap_Node_in_Pairs_24 {

	public static void main(String[] args) {

		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		ListNode head = swapPairs1(node);
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	// recursion
	public static ListNode swapPairs1(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode node = head.next;
		head.next = swapPairs1(head.next.next);
		node.next = head;
		return node;
	}

	// Iterative
	public static ListNode swapPairs2(ListNode head) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode current = dummy;
		while (current.next != null && current.next.next != null) {
			ListNode first = current.next;
			ListNode second = current.next.next;
			first.next = second.next;
			current.next = second;
			current.next.next = first;
			current = current.next.next;
		}
		return dummy.next;
	}
}
