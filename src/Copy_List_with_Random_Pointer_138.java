public class Copy_List_with_Random_Pointer_138 {

	public static void main(String[] args) {
		RandomListNode head = new RandomListNode(-1);
		head.next = new RandomListNode(-1);
		RandomListNode result = copyRandomList(head);
		while (result != null) {
			System.out.print(result.label + " ");
			result = result.next;
		}
	}

	public static RandomListNode copyRandomList(RandomListNode head) {
		cloneNodes(head);
		connectrandomNodes(head);
		return reconnextNodes(head);
	}

	private static void cloneNodes(RandomListNode head) {
		RandomListNode node = head;
		while (node != null) {
			RandomListNode copy = new RandomListNode(node.label);
			copy.next = node.next;
			copy.random = null;
			node.next = copy;
			node = copy.next;
		}
	}

	private static void connectrandomNodes(RandomListNode head) {
		RandomListNode node = head;
		while (node != null) {
			RandomListNode copy = node.next;
			if (node.random != null) {
				copy.random = node.random.next;
			}
			node = copy.next;
		}
	}

	private static RandomListNode reconnextNodes(RandomListNode head) {
		RandomListNode node = head;
		RandomListNode cloneHead = null;
		RandomListNode cloneNode = null;
		if (node != null) {
			cloneHead = cloneNode = node.next;
			node.next = cloneNode.next;
			node = node.next;
		}
		while (node != null) {
			cloneNode.next = node.next;
			cloneNode = cloneNode.next;
			node.next = cloneNode.next;
			node = node.next;
		}
		return cloneHead;
		
	}
}
