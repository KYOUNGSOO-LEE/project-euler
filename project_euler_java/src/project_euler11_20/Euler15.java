//Euler15 Lattice paths
package project_euler11_20;

public class Euler15 {
	public static double factorial(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		double result = 0;
		result = factorial(40) / (factorial(20) * factorial(20));
		System.out.println((long)result);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime) / (double)1000 + "seconds");
	}
}
