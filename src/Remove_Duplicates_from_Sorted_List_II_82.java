
public class Remove_Duplicates_from_Sorted_List_II_82 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(5);
		ListNode result = deleteDuplicates(head);
		while (result != null) {
			System.out.print(result.val + " ");
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode dummy = new ListNode(0);
		ListNode pre = dummy;
		ListNode cur = head;
		dummy.next = head;
		while (cur != null) {
			while (cur.next != null && cur.val == cur.next.val) {
				cur = cur.next;
			}
			if (pre.next == cur) {
				pre = pre.next;
			} else {
				pre.next = cur.next;
			}
			cur = cur.next;
		}
		return dummy.next;
	}
}
