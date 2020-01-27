//Euler25 1000-digit Fibonacci number
package project_euler21_30;

import java.util.ArrayList;
import java.math.BigInteger;

public class Euler25 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		double numDigit = 0;
		ArrayList<BigInteger> fibo = new ArrayList<BigInteger>();
		fibo.add(new BigInteger("1"));
		fibo.add(new BigInteger("1"));
		while(true) {
			fibo.add(fibo.get(fibo.size() - 2).add(fibo.get(fibo.size() - 1)));
			numDigit = fibo.get(fibo.size() - 1).toString().length();
			if ( numDigit > Math.pow(10, 3) - 1) {
				break;
			}
		}
		System.out.println(fibo.size());
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
