//Euler12 Highly divisible triangular number
package project_euler11_20;

public class Euler12 {
	public static int divCount(long n) {
		int count = 0;
		int result = 1;
		long num = n;
		for (int i = 2; i < Math.ceil(n / 2) + 1; i++) {
			count  = 0;
			while (num % i == 0) {
				num /= i;
				count++;
			}
			result *= count + 1;
			if (num == 1) break;
		}
		if (result == 1) {
			return 2;
		}
		else {
			return result;
		}
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long triangular = 1;
		int i = 2;
		while (divCount(triangular) < 500) {
			triangular += i;
			i++;
		}
		System.out.println(triangular);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
