import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal_II_107 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.left.left = null;
		root.left.right = null;
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		List<List<Integer>> list = levelOrderBottom_DFS(root);
		System.out.println(list);
	}

	public static List<List<Integer>> levelOrderBottom_DFS(TreeNode root) {
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
		levelMaker(wrapList, root, 0);
		return wrapList;
	}

	private static void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
		if (root == null)
			return;
		if (level >= list.size()) {
			list.add(0, new LinkedList<Integer>());
		}
		levelMaker(list, root.left, level + 1);
		levelMaker(list, root.right, level + 1);
		list.get(list.size() - level - 1).add(root.val);
	}

	public static List<List<Integer>> levelOrderBottom_BFS(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
		if (root == null)
			return wrapList;
		queue.offer(root);
		while (!queue.isEmpty()) {
			int levelNum = queue.size();
			List<Integer> subList = new LinkedList<Integer>();
			for (int i = 0; i < levelNum; i++) {
				if (queue.peek().left != null)
					queue.offer(queue.peek().left);
				if (queue.peek().right != null)
					queue.offer(queue.peek().right);
				subList.add(queue.poll().val);
			}
			wrapList.add(0, subList);
		}
		return wrapList;
	}

	public static List<List<Integer>> levelOrderBottom_reversed(TreeNode root) {
		List<List<Integer>> outterList = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		if (root == null) {
			return outterList;
		}
		queue.offer(root);
		while (!queue.isEmpty()) {
			List<Integer> list = new ArrayList<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				if (queue.peek().left != null) {
					queue.offer(queue.peek().left);
				}
				if (queue.peek().right != null) {
					queue.offer(queue.peek().right);
				}
				list.add(queue.poll().val);
			}
			outterList.add(list);
		}
		List<List<Integer>> result = new ArrayList<>();
		for (int i = outterList.size() - 1; i >= 0; i--) {
			result.add(outterList.get(i));
		}
		return result;
	}
}
