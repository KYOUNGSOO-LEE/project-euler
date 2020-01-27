package project_euler1_10;

import java.util.ArrayList;

public class Euler4 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		ArrayList<Integer> numList1 = new ArrayList<Integer>();
		ArrayList<Integer> numList2 = new ArrayList<Integer>();
		int product = 0;
		int result = 0;
		
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				product = i * j;
				while (product > 0) {
					numList1.add(product % 10);
					numList2.add(0, product % 10);
					product /= 10;
				}
				if (numList1.equals(numList2)) {
					if (i * j > result) {
						result = i * j;
					}
				}
				numList1.clear();
				numList2.clear();
			}
		}
		System.out.println(result);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 +"seconds");
		System.out.println((endTime - startTime) +"ms");
	}
}