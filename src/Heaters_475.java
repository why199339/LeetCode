import java.util.Arrays;

public class Heaters_475 {

	public static void main(String[] args) {

	}

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int res = 0;
        for(int house : houses) {
        	int index = Arrays.binarySearch(heaters, house);
        	if(index < 0) {
        		index = ~index;
        		int left = index >=1 ? house - heaters[index-1] : Integer.MAX_VALUE;
        		int right = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;
        		res = Math.max(res, Math.min(left, right));
        	}
        }
        return res;
    }
}
