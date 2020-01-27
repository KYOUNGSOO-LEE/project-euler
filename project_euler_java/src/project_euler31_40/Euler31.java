//Euler31 Coin sums
package project_euler31_40;

public class Euler31 {
	public static int func(int change, int coinNum, int k) {
		int[] coins = {200, 100, 50, 20, 10, 5, 2, 1};
		if (change - k * coins[coinNum] == 0) {
			return 1;
		}
		else if (change - k * coins[coinNum] > 0 && coinNum == 6) {
			return 1;
		}
		else if (change - k * coins[coinNum] < 0) {
			return 0;
		}
		else {
			int sum = 0;
			int n = Math.floorDiv(change - k * coins[coinNum], coins[coinNum + 1]) + 1;
			for (int i = 0; i < n; i++) {
				sum += func(change - k * coins[coinNum], coinNum + 1, i);
			}
			return sum;
		}
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(func(200, 0, 0) + func(200, 0, 1));
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}