//Euler29 Distinct powers
package project_euler21_30;

import java.util.HashSet;
import java.math.BigInteger;

public class Euler29 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		HashSet<BigInteger> abSet = new HashSet<BigInteger>();
		for (int a = 2; a < 101; a++) {
			for (int b = 2; b < 101; b++) {
				BigInteger result = BigInteger.valueOf(0);
				BigInteger num = BigInteger.valueOf(a);
				result = num.pow(b);
				abSet.add(result);
			}
		}
		System.out.println(abSet.size());
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
