import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Zigzag_Level_Order_Traversal_103 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		List<List<Integer>> list = zigzagLevelOrder(root);
		System.out.println(list);
	}

	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> sol = new ArrayList<>();
		travel(root, sol, 0);
		return sol;
	}

	private static void travel(TreeNode curr, List<List<Integer>> sol, int level) {
		if (curr == null)
			return;
		if (sol.size() <= level) {
			List<Integer> newLevel = new LinkedList<>();
			sol.add(newLevel);
		}
		List<Integer> collection = sol.get(level);
		if (level % 2 == 0)
			collection.add(curr.val);
		else
			collection.add(0, curr.val);
		travel(curr.left, sol, level + 1);
		travel(curr.right, sol, level + 1);
	}

	public static List<List<Integer>> zigzagLevelOrder_2(TreeNode root) {
		List<List<Integer>> outterList = new ArrayList<>();
		List<Integer> innerList = new ArrayList<>();
		if (root == null) {
			return outterList;
		}
		Stack<TreeNode> current = new Stack<>();
		Stack<TreeNode> next = new Stack<>();
		current.push(root);
		boolean isOdd = true;
		while (!current.isEmpty() || !next.isEmpty()) {
			TreeNode node = current.pop();
			if (node != null) {
				innerList.add(node.val);
			} else {
				innerList.add(null);
			}
			if (isOdd) {
				if (node.left != null) {
					next.push(node.left);
				}
				if (node.right != null) {
					next.push(node.right);
				}
			}
			if (!isOdd) {
				if (node.right != null) {
					next.push(node.right);
				}
				if (node.left != null) {
					next.push(node.left);
				}
			}
			if (current.isEmpty()) {
				Stack<TreeNode> temp = current;
				current = next;
				next = temp;
				isOdd = !isOdd;
				outterList.add(innerList);
				innerList = new ArrayList<>();
			}
		}
		return outterList;
	}
}
