
public class Populating_Next_Right_Pointers_in_Each_Node_116 {

	public static void main(String[] args) {

	}

	public void connect_bfs(TreeLinkNode root) {
		if (root == null) {
			return;
		}
		TreeLinkNode pre = root;
		TreeLinkNode cur = null;
		while (pre.left != null) {
			cur = pre;
			while (cur != null) {
				cur.left.next = cur.right;
				if (cur.next != null) {
					cur.right.next = cur.next.left;
				}
				cur = cur.next;
			}
			pre = pre.left;
		}
	}

	public void connect_Recursive(TreeLinkNode root) {
		if (root == null || root.left == null) {
			return;
		}
		connectNodes(root.left, root.right);
	}

	private void connectNodes(TreeLinkNode node1, TreeLinkNode node2) {
		node1.next = node2;
		if (node1.left != null) {
			connectNodes(node1.right, node2.left);
			connectNodes(node1.left, node1.right);
			connectNodes(node2.left, node2.right);
		}
	}
}
