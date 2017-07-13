
public class Reverse_Linked_List_206 {

	public static void main(String[] args) {

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;

		ListNode node = reverseList_Iterative(node1);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	// O(n)
	public static ListNode reverseList_Iterative(ListNode head) {
		ListNode reverseHead = null;
		ListNode prev = null;
		ListNode cur = head;
		while (cur != null) {
			ListNode next = cur.next;
			if (next == null) {
				reverseHead = cur;
			}
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return reverseHead;
	}

	// O(n)
	public static ListNode reverseList_Recursive(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode p = reverseList_Recursive(head.next);
		head.next.next = head;
		head.next = null;
		return p;
	}

}
