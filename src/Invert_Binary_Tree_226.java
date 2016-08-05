import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Invert_Binary_Tree_226 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		System.out.println(root + "," + root.left + "," + root.right + "," + root.left.left + "," + root.left.right + "," + root.right.left
				 + "," + root.right.right);
		invertTree(root);
		System.out.println(root + "," + root.left + "," + root.right + "," + root.left.left + "," + root.left.right + "," + root.right.left
				 + "," + root.right.right);
	}

	/*  
	 * iterative
	public static TreeNode invertTree(TreeNode root) {
		if (root == null) return null;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.add(root);
    	while (!queue.isEmpty()) {
        	TreeNode current = queue.poll();
        	TreeNode temp = current.left;
        	current.left = current.right;
        	current.right = temp;
        	if (current.left != null) queue.add(current.left);
        	if (current.right != null) queue.add(current.right);
    	}
    }
	*/
	
	/*
	 * recursive
	 */
	public static TreeNode invertTree(TreeNode root) { 
	    if (root == null) {
	        return null;
	    }
	    TreeNode right = invertTree(root.right);
	    TreeNode left = invertTree(root.left);
	    root.left = right;
	    root.right = left;
	    return root;
	}
}
