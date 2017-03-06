import java.util.Stack;

public class Simplify_Path_71 {

	public static void main(String[] args) {

	}

	public static String simplifyPath(String path) {
		Stack<String> stack = new Stack<>();
		StringBuffer sb = new StringBuffer("/");
		for (String dir : path.split("/")) {
			if (dir.equals("..")) {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else if (!dir.equals("") && !dir.equals(".")) {
				stack.push(dir);
			}
		}
		for (String s : stack) {
			sb.append(s).append("/");
		}
		if (!stack.isEmpty()) {
			sb.setLength(sb.length() - 1);
		}
		return sb.toString();
	}
}
