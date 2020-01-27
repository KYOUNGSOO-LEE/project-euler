//Euler7 10001st prime
package project_euler1_10;

public class Euler7 {
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		else if (n == 2) {
			return true;
		}
		else {
			int i = 2;
			while (i < Math.ceil(Math.sqrt(n))+1) {
				if (n % i == 0) {
					return false;
				}
				else {
					i += 1;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int num = 1;
		int order = 1;
		while (order < 10001) {
			num += 2;
			if (isPrime(num)) {
				order += 1;
			}
			else {
				continue;
			}
		}
		System.out.println(num);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime) / (double)1000 + "seconds");
	}
}
