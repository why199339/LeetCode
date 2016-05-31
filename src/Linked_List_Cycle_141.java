import java.util.HashSet;
import java.util.Set;

public class Linked_List_Cycle_141 {

	public static void main(String[] args) {

		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(0);
		ListNode node4 = new ListNode(-4);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node2;

		System.out.println(hasCycle(node1));
	}

	// Two Pointers, Time complexity : O(n), Space complexity : O(1)
	public static boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
	        return false;
	    }
		ListNode slow = head;
		ListNode fast = head.next;
		while(slow != fast) {
			if(fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
	
	/*
	 * own: Hash Table, Time complexity : O(n), Space complexity: O(n)
	public static boolean hasCycle(ListNode head) {
		Set<ListNode> set = new HashSet<>();
		while (head != null) {
			if (!set.add(head)) {
				return true;
			}
			set.add(head);
			head = head.next;
		}
		return false;
	}
	*/
}
