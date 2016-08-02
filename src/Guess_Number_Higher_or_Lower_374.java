
public class Guess_Number_Higher_or_Lower_374 extends GuessGame {

	public static void main(String[] args) {
		System.out.println(guessNumber(10));
	}

	// Ternary Search: O(log​3​​n)
	public static int guessNumber(int n) {
		int low = 1;
        int high = n;
        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            int res1 = guess(mid1);
            int res2 = guess(mid2);
            if (res1 == 0)
                return mid1;
            if (res2 == 0)
                return mid2;
            else if (res1 < 0)
                high = mid1 - 1;
            else if (res2 > 0)
                low = mid2 + 1;
            else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }
        return -1;
	}
	
	/* Binary Search: O(log​2​​n)
	public static int guessNumber(int n) {
       int low = 1; 
       int high = n;
       while(low <= high) {
    	   int mid = low + (high - low) / 2;
    	   int result = GuessGame.guess(mid);
    	   if(result == 0) {
    		   return mid;
    	   } else if(result == -1) {
    		   high = mid - 1;
    	   } else {
    		   low = mid + 1;
    	   }
       }
       return -1;
    }
    */
}
class GuessGame {
	public static int result = 6;
	public static int guess(int num) {
		if(result < num) {
			return -1;
		}
		if(result > num) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
