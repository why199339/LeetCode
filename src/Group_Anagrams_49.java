import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams_49 {

	public static void main(String[] args) {

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		if(strs == null || strs.length == 0) {
        	return new ArrayList<List<String>>();
        }
		HashMap<String, List<String>> map = new HashMap<>();
		for(String str : strs) {
			char[] chs = str.toCharArray();
			Arrays.sort(chs);
			String s = String.valueOf(chs);
			if(!map.containsKey(s)) {
				map.put(s, new ArrayList<String>());
			}
			map.get(s).add(str);
		}
		return new ArrayList<List<String>>(map.values());
    }
}
