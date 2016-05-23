import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer_13 {

	public static void main(String[] args) {

		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("VI"));
		System.out.println(romanToInt("XIX"));
		System.out.println(romanToInt("XX"));
		System.out.println(romanToInt("XLV"));
	}

	/*
	public static int romanToInt(String s) {
		int res = 0;
	    for (int i = s.length() - 1; i >= 0; i--) {
	        char c = s.charAt(i);
	        switch (c) {
	        case 'I':
	            res += (res >= 5 ? -1 : 1);
	            break;
	        case 'V':
	            res += 5;
	            break;
	        case 'X':
	            res += 10 * (res >= 50 ? -1 : 1);
	            break;
	        case 'L':
	            res += 50;
	            break;
	        case 'C':
	            res += 100 * (res >= 500 ? -1 : 1);
	            break;
	        case 'D':
	            res += 500;
	            break;
	        case 'M':
	            res += 1000;
	            break;
	        }
	    }
	    return res;
	}
	*/
	
	public static int romanToInt(String s) {
		//：Ⅰ（1）Ⅴ（5）Ⅹ（10）L（50）C（100）D（500）M（1000） 
        // rules:位于大数的后面时就作为加数；位于大数的前面就作为减数
        //eg：Ⅲ=3,Ⅳ=4,Ⅵ=6,ⅩⅨ=19,ⅩⅩ=20,ⅩLⅤ=45,MCMⅩⅩC=1980
        //"DCXXI"
		if(s == null || s.length() == 0) {
			return 0;
		}
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int sum = map.get(s.charAt(s.length()-1));
		int pivot = sum;
		for (int i = s.length()-2; i >= 0; i--) {
			int num = map.get(s.charAt(i));
			if(num >= pivot) {
				sum = sum + num;
			} else {
				sum = sum - num;
			}
			pivot = num;
		}
		return sum;
    }
    
}
