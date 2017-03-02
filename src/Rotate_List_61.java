
public class Rotate_List_61 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		int k = 2;
		ListNode node = rotateRight(head, k);
		System.out.println(node.val + "," + node.next.val);
	}

	public static ListNode rotateRight(ListNode head, int k) {
		if (head == null) {
			return null;
		}
		ListNode tail = head;
		ListNode newHead = head;
		int len = 1;
		while (tail.next != null) {
			tail = tail.next;
			len++;
		}
		tail.next = head;
		if (k % len != 0) {
			k = k % len;
			for (int i = 0; i < len - k; i++) {
				tail = tail.next;
			}
		}
		newHead = tail.next;
		tail.next = null;
		return newHead;
	}
}
