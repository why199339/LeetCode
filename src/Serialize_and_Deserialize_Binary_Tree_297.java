import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Serialize_and_Deserialize_Binary_Tree_297 {

	public static void main(String[] args) {

	}

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		StringBuffer sb = new StringBuffer();
		buildString(root, sb);
		return sb.toString();
	}

	private void buildString(TreeNode root, StringBuffer sb) {
		if (root == null) {
			sb.append("$").append(",");
		} else {
			sb.append(root.val).append(",");
			buildString(root.left, sb);
			buildString(root.right, sb);
		}
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		Queue<String> queue = new LinkedList<>();
		queue.addAll(Arrays.asList(data.split(",")));
		return buildTree(queue);
	}

	private TreeNode buildTree(Queue<String> queue) {
		String val = queue.poll();
		if (val.equals("$")) {
			return null;
		} else {
			TreeNode node = new TreeNode(Integer.valueOf(val));
			node.left = buildTree(queue);
			node.right = buildTree(queue);
			return node;
		}
	}
}
