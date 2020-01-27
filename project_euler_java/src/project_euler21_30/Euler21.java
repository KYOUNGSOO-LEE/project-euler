//Euler21 Amicable numbers
package project_euler21_30;

public class Euler21 {
	public static int div(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int sum = 0;
		for (int i = 1; i < 10001; i++) {
			if (i == div(div(i)) && i != div(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime) / (double)1000 + "seconds");
	}
}
