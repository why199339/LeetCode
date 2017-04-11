
public class Insertion_Sort_List_147 {

	public static void main(String[] args) {

	}

	public static ListNode insertionSortList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode dummy = new ListNode(0);
		ListNode cur = head;
		ListNode next = null;
		ListNode pre = dummy;
		while (cur != null) {
			next = cur.next;
			while (pre.next != null && pre.next.val < cur.val) {
				pre = pre.next;
			}
			cur.next = pre.next;
			pre.next = cur;
			pre = dummy;
			cur = next;
		}
		return dummy.next;
	}
}
