//Euler10 Summation of primes
package project_euler1_10;

import java.util.ArrayList;

public class Euler10 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long sum = 0;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		ArrayList<Integer> signPrimes = new ArrayList<Integer>();		
		for (int i = 0; i < 2 * Math.pow(10, 6) + 1; i++) {
			signPrimes.add(1);
		}
		signPrimes.set(0, 0);
		signPrimes.set(1, 0);
		signPrimes.set(2, 1);
		for (int i = 2; i < 2 * Math.pow(10, 6) + 1; i++) {
			if (signPrimes.get(i) == 1) {
				primes.add(i);
				for (int j = 2; j < Math.floor(2 * Math.pow(10, 6) / i) + 1; j++) {
					signPrimes.set(j * i, 0);
				}
			}
		}
		for (int i = 0; i < primes.size(); i++) {
			sum += primes.get(i);
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime) / (double) 1000 + "seconds");
	}
}