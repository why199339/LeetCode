import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Reconstruct_Itinerary_332 {

	public static void main(String[] args) {

	}

	Map<String, PriorityQueue<String>> map = new HashMap<>();
	List<String> res = new ArrayList<String>();

	public List<String> findItinerary(String[][] tickets) {
		for (String[] ticket : tickets) {
			if (map.containsKey(ticket[0])) {
				map.get(ticket[0]).offer(ticket[1]);
			} else {
				PriorityQueue<String> queue = new PriorityQueue<>();
				queue.offer(ticket[1]);
				map.put(ticket[0], queue);
			}
		}
		visit("JFK");
		return res;
	}

	private void visit(String airpot) {
		while (map.containsKey(airpot) && !map.get(airpot).isEmpty()) {
			visit(map.get(airpot).poll());
		}
		res.add(0, airpot);
	}

}
