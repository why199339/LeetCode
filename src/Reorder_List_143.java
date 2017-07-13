
public class Reorder_List_143 {

	public static void main(String[] args) {

	}

	public void reorderList(ListNode head) {
		if (head == null || head.next == null)
			return;
		// Find the middle of the list
		ListNode slow = head;
		ListNode fast = head;
		ListNode l1 = head;
		ListNode prev = null;
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = null;
		// Reverse the half after middle 1->2->3->4->5->6 to 1->2->3->6->5->4
		ListNode l2 = reverse(slow);
		// Start reorder one by one 1->2->3->6->5->4 to 1->6->2->5->3->4
		merge(l1, l2);
	}

	private void merge(ListNode l1, ListNode l2) {
		while(l1 != null) {
			ListNode n1 = l1.next;
			ListNode n2 = l2.next;
			l1.next = l2;
			if(n1 == null) {
				break;
			}
			l2.next = n1;
			l1 = n1;
			l2 = n2;
		}
	}

	private ListNode reverse(ListNode head) {
		ListNode reverseHead = null;
		ListNode prev = null;
		ListNode cur = head;
		while(cur != null) {
			ListNode next = cur.next;
			if(next == null) {
				reverseHead = cur;
			}
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return reverseHead;
	}
}
