//Euler6 Sum square difference
package project_euler1_10;

public class Euler6 {
	public static int sumSqure(int n) {
		int result = 0;
		for (int i = 1; i < n + 1; i++) {
			result += Math.pow(i, 2);
		}
		return result;
	}
	public static double squreSum(int n) {
		int sum = 0;
		double result = 0;
		for (int i = 1; i < n + 1; i++) {
			sum += i;
		result = Math.pow(sum, 2);
		}
		return result;
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(squreSum(100) - sumSqure(100));
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime) / (double)1000 + "seconds");
	}
}
