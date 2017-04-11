
public class Sort_List_148 {

	public static void main(String[] args) {

	}

	public static ListNode sortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = null;
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = null;
		ListNode l1 = sortList(head);
		ListNode l2 = sortList(slow);
		return merge(l1, l2);
	}

	private static ListNode merge(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode node = dummy;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				node.next = l1;
				l1 = l1.next;
			} else {
				node.next = l2;
				l2 = l2.next;
			}
			node = node.next;
		}
		if (l1 != null) {
			node.next = l1;
		}
		if (l2 != null) {
			node.next = l2;
		}
		return dummy.next;
	}
}
