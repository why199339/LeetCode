
public class Odd_Even_Linked_List_328 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode node = head;
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println();
		node = oddEvenList(head);
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}

	public static ListNode oddEvenList(ListNode head) {
		if (head == null)
			return null;
		ListNode odd = head, even = head.next, evenHead = even;
		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}
}
