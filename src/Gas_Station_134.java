
public class Gas_Station_134 {

	public static void main(String[] args) {

	}

	public int canCompleteCircuit(int[] gas, int[] cost) {
		int gasSum = 0;
		int costSum = 0;
		int start = 0;
		int tank = 0;
		for (int i = 0; i < gas.length; i++) {
			gasSum += gas[i];
			costSum += cost[i];
			tank += gas[i] - cost[i];
			if (tank < 0) {
				tank = 0;
				start = i + 1;
			}
		}
		if (gasSum >= costSum) {
			return start;
		} else {
			return -1;
		}
	}
}
