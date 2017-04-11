import java.util.LinkedList;
import java.util.Queue;

public class Course_Schedule_207 {

	public static void main(String[] args) {

	}

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		int[] indegree = new int[numCourses];
		Queue<Integer> queue = new LinkedList<>();
		for (int[] pair : prerequisites) {
			indegree[pair[1]]++;
		}
		for (int i = 0; i < indegree.length; i++) {
			if (indegree[i] == 0) {
				queue.add(i);
			}
		}
		while (!queue.isEmpty()) {
			int course = queue.poll();
			numCourses--;
			for (int[] pair : prerequisites) {
				if (pair[0] == course) {
					indegree[pair[1]]--;
					if (indegree[pair[1]] == 0) {
						queue.add(pair[1]);
					}
				}
			}
		}
		return numCourses == 0;
	}
}
