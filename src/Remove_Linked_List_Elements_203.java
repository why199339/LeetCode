
public class Remove_Linked_List_Elements_203 {

	public static void main(String[] args) {

	}

	public ListNode removeElements(ListNode head, int val) {
		ListNode fakeHead = new ListNode(-1);
		fakeHead.next = head;
		ListNode curr = head, prev = fakeHead;
		while (curr != null) {
			if (curr.val == val) {
				prev.next = curr.next;
			} else {
				prev = prev.next;
			}
			curr = curr.next;
		}
		return fakeHead.next;
	}

	public static ListNode removeElements_own(ListNode head, int val) {
		if (head == null) {
			return null;
		}
		while (head != null && head.val == val) {
			head = head.next;
		}
		ListNode node = head;
		while (node != null && node.next != null) {
			while (node != null && node.next != null && node.next.val == val) {
				node.next = node.next.next;
			}
			node = node.next;
		}
		return head;
	}
}
