
public class Merge_Two_Sorted_Lists_21 {

	public static void main(String[] args) {
		//l1: 1->2->4
		//l2: 2->3
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		l1.next = new ListNode(2);
		l2.next = new ListNode(3);
		l1.next.next = new ListNode(4);
		ListNode p = mergeTwoLists(l1, l2);
		while (p != null) {
			System.out.print(p.val + "\t");
			p = p.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
	}
	
	/*
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        ListNode mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;
	}
	 */
	/* own
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode q = new ListNode(0);
		ListNode p = q;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				p.next = new ListNode(l1.val);
				l1 = l1.next;
				p = p.next;
			} else {
				p.next = new ListNode(l2.val);
				l2 = l2.next;
				p = p.next;
			}
		}
		while (l1 != null) {
			p.next = new ListNode(l1.val);
			l1 = l1.next;
			p = p.next;
		}
		while (l2 != null) {
			p.next = new ListNode(l2.val);
			l2 = l2.next;
			p = p.next;
		}
		return q.next;
	}
	*/
}
