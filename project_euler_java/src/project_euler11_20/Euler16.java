//Euler16 Power digit sum
package project_euler11_20;

import java.math.BigInteger;

public class Euler16 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		double sum = 0;
		BigInteger num = BigInteger.valueOf(2).pow(1000);
		String numString = num.toString();
		for (int i = 0; i < numString.length(); i++) {
			sum += Integer.parseInt(numString.charAt(i) + "");
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
