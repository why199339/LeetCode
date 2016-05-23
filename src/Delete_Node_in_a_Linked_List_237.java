
public class Delete_Node_in_a_Linked_List_237 {

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;
		ListNode node = a;
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		// System.out.println(a + " " + a.next + " " + a.next.next + " " +
		// a.next.next.next + " " + a.next.next.next.next);
		deleteNode(c);
		System.out.println();
		System.out.println("-----------------------");
		node = a;
		// System.out.println(a + " " + a.next + " " + a.next.next + " " +
		// a.next.next.next + " " + a.next.next.next.next);
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}

	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
