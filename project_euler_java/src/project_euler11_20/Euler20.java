//Euler20 Factorial digit sum
package project_euler11_20;

import java.math.BigInteger;

public class Euler20 {
	public static BigInteger factorial(BigInteger n) {
		if (n.compareTo(BigInteger.valueOf(1)) == 0) {
			return BigInteger.valueOf(1);
		} else {
			return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
		}
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int sum = 0;
		BigInteger num = factorial(BigInteger.valueOf(100));
		String numString = num.toString();
		for (int i = 0; i < numString.length(); i++) {
			sum += Integer.parseInt(numString.charAt(i) + "");
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime) / (double)1000 + "seconds");
	}
}
