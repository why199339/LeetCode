
public class House_Robber_198 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		System.out.println(rob(nums));
	}

	public static int rob(int[] nums) {
		int preYes = 0;
		int preNo = 0;
		for (int i = 0; i < nums.length; i++) {
			int curYes = preNo + nums[i];
			int curNo = Math.max(preNo, preYes);
			preNo = curNo;
			preYes = curYes;
		}
		return Math.max(preYes, preNo);
	}
}
/*
1 4 6 2 5 3
	rob		notrob
	0		0
1. 	1		0
4.	4		1
6.	7		4
2.	6		7
5.	12		7
3.	10		12
*/