
public class Remove_Duplicates_from_Sorted_List_83 {

	public static void main(String[] args) {

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		ListNode node = deleteDuplicates(node1);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}
	
	// Straight-Forward Approach : O(n)
	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null) {
			return null;
		}
		ListNode node = head;
		while(head.next != null) {
			if(head.next.val == head.val) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}
		return node;
	}
	
	/*
	 * own
	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null) {
			return null;
		}
		ListNode node = new ListNode(head.val);
		ListNode result = node;
		while (head != null) {
			if (node.val == head.val) {
				head = head.next;
				continue;
			}
			node.next = new ListNode(head.val);
			node = node.next;
			head = head.next;
		}
		return result;
	}
	*/
}
