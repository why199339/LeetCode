import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Minimum_Index_Sum_of_Two_Lists_599 {

	public static void main(String[] args) {
		String[] list1 = new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] list2 = new String[] { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };
		String[] res = findRestaurant_own(list1, list2);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	public static String[] findRestaurant_better(String[] list1, String[] list2) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);
		}
		List<String> list = new ArrayList<>();
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int j = 0; j < list2.length && j <= min; j++) {
			if (map.containsKey(list2[j])) {
				sum = j + map.get(list2[j]);
				if (sum < min) {
					min = sum;
					list.clear();
					list.add(list2[j]);
				} else if (sum == min) {
					list.add(list2[j]);
				}
			}
		}
		return list.toArray(new String[list.size()]);
	}

	public static String[] findRestaurant_own(String[] list1, String[] list2) {
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		for (int i = 0; i < list1.length; i++) {
			map1.put(list1[i], i);
		}
		for (int i = 0; i < list2.length; i++) {
			map2.put(list2[i], i);
		}
		int min = Integer.MAX_VALUE;
		ArrayList<String> list = new ArrayList<>();
		for (Entry<String, Integer> set1 : map1.entrySet()) {
			String key = set1.getKey();
			int value = set1.getValue();
			if (map2.containsKey(key)) {
				if (value + map2.get(key) < min) {
					min = value + map2.get(key);
					list.clear();
					list.add(key);
				} else if (value + map2.get(key) == min) {
					list.add(key);
				}
			}
		}
		String[] res = new String[list.size()];
		int index = 0;
		for (String str : list) {
			res[index++] = str;
		}
		return res;
	}
}
