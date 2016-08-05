
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal_102 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
//		root.right = new TreeNode(20);
//		root.left.left = null;
//		root.left.right = null;
//		root.right.left = new TreeNode(15);
//		root.right.right = new TreeNode(7);
		List<List<Integer>> list = levelOrder(root);
		System.out.println(list);
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> outterList = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root == null) {
			return outterList;
		}
		queue.offer(root);
		while (!queue.isEmpty()) {
			int s = queue.size();
			List<Integer> innerList = new ArrayList<>();
			for(int i=0; i<s; i++) {
				if(queue.peek().left != null) {
					queue.offer(queue.peek().left);
				}
				if(queue.peek().right != null) {
					queue.offer(queue.peek().right);
				}
				innerList.add(queue.poll().val);
			}
			outterList.add(innerList);
		}
		return outterList;
	}
}
