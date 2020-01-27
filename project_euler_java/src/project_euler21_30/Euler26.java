//Euler26 Reciprocal cycles
package project_euler21_30;

import java.util.ArrayList;
import java.util.Collections;

public class Euler26 {
	public static int remainder(int i, int r) {
		return 10 * r % i;
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		ArrayList<Integer> sizeCycle = new ArrayList<Integer>();
		for (int i = 2; i < 1000; i++) {
			ArrayList<Integer> remainders = new ArrayList<Integer>();
			remainders.add(1);
			while(true) {
				int value = remainder(i, remainders.get(remainders.size() - 1));
				if (remainders.contains(value) == true || value == 0) {
					sizeCycle.add(remainders.size());
					break;
				} else {
					remainders.add(value);
				}
			}
		}
		System.out.println(sizeCycle.indexOf(Collections.max(sizeCycle)) + 2);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
