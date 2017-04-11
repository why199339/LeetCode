
public class Palindrome_Linked_List_234 {

	public static void main(String[] args) {

	}

	public boolean isPalindrome(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast != null) {
			slow = slow.next;
		}
		slow = reverse(slow);
		fast = head;
		while (slow != null) {
			if (fast.val != slow.val) {
				return false;
			}
			fast = fast.next;
			slow = slow.next;
		}
		return true;
	}

	private ListNode reverse(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode p = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return p;
	}
}
