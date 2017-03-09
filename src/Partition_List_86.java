
public class Partition_List_86 {

	public static void main(String[] args) {
		
	}

    public static ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        ListNode dummy1 = before;
        ListNode dummy2 = after;
        while(head != null) {
        	if(head.val < x) {
        		before.next = head;
        		before = before.next;
        	} else {
        		after.next = head;
        		after = after.next;
        	}
        	head = head.next;
        }
        before.next = dummy2.next;
        after.next = null;
        return dummy1.next;
    }
}
