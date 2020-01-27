//Euler14 Longest Collatz sequence
package project_euler11_20;

public class Euler14 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int count = 0;
		int maxCount = 0;
		int maxValue = 0;
		long num = 0;
		for (int i = 2; i < Math.pow(10, 6); i++) {
			num = i;
			count = 0;
			while (num > 1) {
				if (num % 2 == 0) {
					num /= 2;
				}
				else {
					num = 3 * num + 1;
				}
				count++;
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = i;
			}
		}
		System.out.println(maxValue);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
