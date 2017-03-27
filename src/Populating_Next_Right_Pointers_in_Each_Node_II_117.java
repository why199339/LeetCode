
public class Populating_Next_Right_Pointers_in_Each_Node_II_117 {

	public static void main(String[] args) {

	}

	public void connect(TreeLinkNode root) {
		TreeLinkNode cur = root;
		TreeLinkNode prev = null;
		TreeLinkNode head = null;
		while (cur != null) {
			while (cur != null) {
				if (cur.left != null) {
					if (prev != null) {
						prev.next = cur.left;
					} else {
						head = cur.left;
					}
					prev = cur.left;
				}
				if (cur.right != null) {
					if (prev != null) {
						prev.next = cur.right;
					} else {
						head = cur.right;
					}
					prev = cur.right;
				}
				cur = cur.next;
			}
			cur = head;
			head = null;
			prev = null;
		}
	}
}
