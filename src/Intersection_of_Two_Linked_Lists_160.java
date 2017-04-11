
public class Intersection_of_Two_Linked_Lists_160 {

	public static void main(String[] args) {

	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		int lenA = 0;
		int lenB = 0;
		ListNode nodeA = headA;
		ListNode nodeB = headB;
		while (nodeA != null) {
			lenA++;
			nodeA = nodeA.next;
		}
		while (nodeB != null) {
			lenB++;
			nodeB = nodeB.next;
		}
		int diff = lenA - lenB;
		ListNode shortNode = headB;
		ListNode longNode = headA;
		if (lenA < lenB) {
			diff = -diff;
			shortNode = headA;
			longNode = headB;
		}
		while (diff > 0) {
			longNode = longNode.next;
			diff--;
		}
		while (longNode != null && shortNode != null) {
			if (longNode == shortNode) {
				return longNode;
			}
			longNode = longNode.next;
			shortNode = shortNode.next;
		}
		return null;
	}
}
