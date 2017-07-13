import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average_of_Levels_in_Binary_Tree_637 {

	public static void main(String[] args) {

	}

	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			long sum = 0;
			long count = 0;
			Queue<TreeNode> temp = new LinkedList<>();
			while (!queue.isEmpty()) {
				TreeNode cur = queue.poll();
				count++;
				sum += cur.val;
				if (cur.left != null) {
					temp.add(cur.left);
				}
				if (cur.right != null) {
					temp.add(cur.right);
				}
			}
			queue = temp;
			res.add(sum * 1.0 / count);
		}
		return res;
	}
}
