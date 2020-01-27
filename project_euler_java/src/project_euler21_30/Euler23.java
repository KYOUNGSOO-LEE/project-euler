//Euler23 Non-abundant sums
package project_euler21_30;

import java.util.ArrayList;

public class Euler23 {
	public static boolean isabdt(int n) {
		int sum = 0;
		for (int i = 1; i < Math.floor(n/2) + 1; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (n < sum) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] arg) {
		long startTime = System.currentTimeMillis();
		int value = 28123;
		long sum = 0;
		ArrayList<Integer> listAbdt = new ArrayList<Integer>();
		ArrayList<Integer> codeSum = new ArrayList<Integer>();
		for (int i = 0; i < value + 1; i++) {
			if (isabdt(i) == true) {
				listAbdt.add(i);
			}
		}
		for (int i = 0; i < value + 1; i++) {
			codeSum.add(0);
		}
		for (int i = 0; i < listAbdt.size(); i++) {
			for (int j = 0; j < listAbdt.size(); j++) {
				if (listAbdt.get(i) + listAbdt.get(j) <= value) {
					codeSum.set(listAbdt.get(i) + listAbdt.get(j), 1);
				}
			}
		}
		for (int i = 0; i < codeSum.size(); i++) {
			if (codeSum.get(i) == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
