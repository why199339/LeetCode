import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Design_Log_Storage_System_635 {

	TreeMap<Long, Integer> map;

	public Design_Log_Storage_System_635() {
		map = new TreeMap<Long, Integer>();
	}

	public void put(int id, String timestamp) {
		int[] st = Arrays.stream(timestamp.split(":")).mapToInt(Integer::parseInt).toArray();
		map.put(convert(st), id);
	}

	public long convert(int[] st) {
		st[1] = st[1] - (st[1] == 0 ? 0 : 1);
		st[2] = st[2] - (st[2] == 0 ? 0 : 1);
		return (st[0] - 1999L) * (31 * 12) * 24 * 60 * 60 + st[1] * 31 * 24 * 60 * 60 + st[2] * 24 * 60 * 60
				+ st[3] * 60 * 60 + st[4] * 60 + st[5];
	}

	public List<Integer> retrieve(String s, String e, String gra) {
		ArrayList<Integer> res = new ArrayList<>();
		long start = granularity(s, gra, false);
		long end = granularity(e, gra, true);
		for (long key : map.tailMap(start).keySet()) {
			if (key >= start && key < end)
				res.add(map.get(key));
		}
		return res;
	}

	public long granularity(String s, String gra, boolean end) {
		HashMap<String, Integer> h = new HashMap<>();
		h.put("Year", 0);
		h.put("Month", 1);
		h.put("Day", 2);
		h.put("Hour", 3);
		h.put("Minute", 4);
		h.put("Second", 5);
		String[] res = new String[] { "1999", "00", "00", "00", "00", "00" };
		String[] st = s.split(":");
		for (int i = 0; i <= h.get(gra); i++) {
			res[i] = st[i];
		}
		int[] t = Arrays.stream(res).mapToInt(Integer::parseInt).toArray();
		if (end)
			t[h.get(gra)]++;
		return convert(t);
	}

}
