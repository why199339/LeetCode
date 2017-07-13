
public class Reverse_Linked_List_II_92 {

	public static void main(String[] args) {

	}

	public static ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode fPrev = null;
		ListNode tNext = null;
		ListNode node1 = head;
		int len = 0;
		while (node1 != null) {
			len++;
			fPrev = (len == m - 1) ? node1 : fPrev;
			tNext = (len == n + 1) ? node1 : tNext;
			node1 = node1.next;
		}
		if(m > n || n > len || m < 1) {
			return head;
		}
		node1 = (fPrev == null) ? head : fPrev.next;
		ListNode node2 = node1.next;
		node1.next = tNext;
		while(node2 != tNext) {
			ListNode next = node2.next;
			node2.next = node1;
			node1 = node2;
			node2 = next;
		}
		if(fPrev != null) {
			fPrev.next = node1;
			return head;
		}
		return node1;
	}
}
