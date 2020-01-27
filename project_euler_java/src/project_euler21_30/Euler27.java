//Euler27 Quadratic primes
package project_euler21_30;

import java.util.ArrayList;

public class Euler27 {
	public static int formula(int n, int a, int b) {
		return (int)Math.pow(n, 2) + a * n + b;
	}
	public static boolean isprime(int n) {
		if (n == -1 || n == 0 || n == 1) {
			return false;
		} else {
			for (int i = 2; i < Math.floor(Math.sqrt(Math.abs(n)) + 2); i++) {
				if (n % i == 0){
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int maxNum = 0;
		int product = 0;
		int n = 0;
		ArrayList<Integer> aList = new ArrayList<Integer>();
		ArrayList<Integer> bList = new ArrayList<Integer>();
		for (int i = -1000; i < 1001; i++) {
			if (i % 2 != 0) {
				aList.add(i);
			}
		}
		for (int i = -1000; i < 1001; i++) {
			if (isprime(i) == true) {
				bList.add(i);
			}
		}
		for (Integer a : aList) {
			for (Integer b : bList) {
				n = 0;
				while(true) {
					if (isprime(formula(n, a, b)) == false) {
						if (n > maxNum) {
							maxNum = n;
							product = a * b;
						}
						break;
					}
					n++;
				}
			}
		}
		System.out.println(product);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
