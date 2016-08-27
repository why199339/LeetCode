
public class Linked_List_Cycle_II_142 {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(0);
		ListNode node4 = new ListNode(-4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node2;
		ListNode node = detectCycle(node1);
		if (node != null) {
			System.out.println(node.val);
		}
	}

	public static ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null)
			return null;
		ListNode firstp = head;
		ListNode secondp = head;
		boolean isCycle = false;
		while (firstp != null && secondp != null) {
			firstp = firstp.next;
			if (secondp.next == null)
				return null;
			secondp = secondp.next.next;
			if (firstp == secondp) {
				isCycle = true;
				break;
			}
		}
		if (!isCycle)
			return null;
		firstp = head;
		while (firstp != secondp) {
			firstp = firstp.next;
			secondp = secondp.next;
		}
		return firstp;
	}
}
