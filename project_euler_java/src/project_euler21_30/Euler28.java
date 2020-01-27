//Euler28 Number spiral diagonals
package project_euler21_30;

import java.util.ArrayList;

public class Euler28 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int sumDiagonals = 1;
		int i = 1;
		ArrayList<Integer> numFirst = new ArrayList<Integer>();
		for (int n = 1; n < 501; n++) {
			numFirst.add(4 * (int)Math.pow(n, 2) - 2 * n + 1);
		}
		for (Integer n : numFirst) {
			sumDiagonals += 4 * n + 12 * i;
			i++;
		}
		System.out.println(sumDiagonals);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
