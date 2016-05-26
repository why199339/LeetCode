
public class Climbing_Stairs_70 {

	public static void main(String[] args) {

		System.out.println(climbStairs(4));
	}

	public static int climbStairs(int n) {
        int[] ways = new int[n];
        if(n == 1) {
        	return 1;
        }
        ways[0] = 1;
        ways[1] = 2;
        for(int i=2; i<n; i++) {
        	ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n-1];
    }
}
