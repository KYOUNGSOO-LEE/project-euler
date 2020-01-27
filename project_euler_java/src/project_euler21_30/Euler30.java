//Euler30 Digit fifth powers
package project_euler21_30;

import java.util.ArrayList;

public class Euler30 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int sumDigit = 0;
		int sumResult = 0;
		String nStr;
		String data[];
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		for (int i = 10; i < Math.pow(10, 6); i++) {
			nStr = String.valueOf(i);
			data = nStr.split("");
			sumDigit = 0;
			for (String s : data) {
				sumDigit += Math.pow(Integer.parseInt(s), 5);
			}
			if (i == sumDigit) {
				resultList.add(sumDigit);
			}
		}
		for (Integer i : resultList) {
			sumResult += i;
		}
		System.out.println(sumResult);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
