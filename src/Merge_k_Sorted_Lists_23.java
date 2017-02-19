import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists_23 {

	public static void main(String[] args) {
		
	}
	
	//Use PriorityQueue
	public static ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length== 0) {
        	return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.val - o2.val;
			}
		});
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for(ListNode node : lists) {
        	if(node != null) {
        		queue.add(node);
        	}
        }
        while(!queue.isEmpty()) {
        	tail.next = queue.poll();
        	tail = tail.next;
        	if(tail.next != null) {
        		queue.add(tail.next);
        	}
        }
        return dummy.next;
    }
    
}
