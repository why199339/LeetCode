
public class Convert_Sorted_List_to_Binary_Search_Tree_109 {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		TreeNode result = sortedListToBST_own(head);
		System.out.println(result.val);
	}

	public TreeNode sortedListToBST_better(ListNode head) {
		if (head == null) {
			return null;
		}
		return build_better(head, null);
	}

	private TreeNode build_better(ListNode head, ListNode tail) {
		ListNode fast = head;
		ListNode slow = head;
		if (head == tail) {
			return null;
		}
		while (fast != tail && fast.next != tail) {
			fast = fast.next.next;
			slow = slow.next;
		}
		TreeNode root = new TreeNode(slow.val);
		root.left = build_better(head, slow);
		root.right = build_better(slow.next, tail);
		return root;
	}

	// O(n), O(n)
	public static TreeNode sortedListToBST_own(ListNode head) {
		if (head == null) {
			return null;
		}
		int size = 0;
		ListNode node = head;
		while (node != null) {
			size++;
			node = node.next;
		}
		int[] nums = new int[size];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = head.val;
			head = head.next;
		}
		return build_own(nums, 0, nums.length - 1);
	}

	private static TreeNode build_own(int[] nums, int low, int high) {
		if (low > high) {
			return null;
		}
		int mid = (low + high) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = build_own(nums, low, mid - 1);
		root.right = build_own(nums, mid + 1, high);
		return root;
	}
}
