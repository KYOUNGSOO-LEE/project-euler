//Euler33 Digit cancelling fractions
package project_euler31_40;

import java.util.ArrayList;

public class Euler33 {
	public static int findgcd(int i, int j) {
		if (i < j) {
			int temp = i;
			i = j;
			j = temp;
		}
		if (j == 0) {
			return i;
		} else {
			return findgcd(j, i % j);
		}
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int numerator = 1;
		int denominator = 1;
		String idata[];
		String jdata[];
		ArrayList<Integer> iList = new ArrayList<Integer>();
		ArrayList<Integer> jList = new ArrayList<Integer>();
		for (int i = 11; i < 100; i++) {
			for (int j = 10; j < i; j++) {
				
				String iStr = Integer.toString(i);
				String jStr = Integer.toString(j);
				iList.clear();
				jList.clear();
				
				idata = iStr.split("");
				for (int k = 0; k < iStr.length(); k++) {
					iList.add(Integer.parseInt(idata[k]));
				}
				jdata = jStr.split("");
				for (int k = 0; k < jStr.length(); k++) {
				jList.add(Integer.parseInt(jdata[k]));
				}
				for (int n = 0; n < 2; n++) {
					if (iList.get(n) == jList.get(1 - n) && iList.get(1 - n) != 0) {
						if ((double)jList.get(n) / iList.get(1 - n) == (double)j / i) {
							numerator *= j;
							denominator *= i;
						}
					}
				}
			}
		}
		denominator /= findgcd(numerator, denominator);
		System.out.println(denominator);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
