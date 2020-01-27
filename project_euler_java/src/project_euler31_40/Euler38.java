//Euler38 Pandigital multiples
package project_euler31_40;

import java.util.ArrayList;
import java.util.Collections;

public class Euler38 {
	public static Boolean ispandigit(int n) {
		String data[];
		String str = "";
		ArrayList<Integer> nList = new ArrayList<Integer>();
		
		str = Integer.toString(n);
		data = str.split("");
		for (int i = 0; i < data.length; i++) {
			nList.add(Integer.parseInt(data[i]));
		}
		Collections.sort(nList);
		for (int i = 0; i < 9; i++) {
			if (i + 1 != nList.get(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int maximum = 0;
		int nNum = 0;
		String sNum = "";
		for (int i = 0; i < Math.pow(10, 4); i++) {
			sNum = "";
			for (int n = 1; n < 9; n++) {
				sNum = sNum + Integer.toString(i * n);
				if (sNum.length() == 9) {
					nNum = Integer.parseInt(sNum);
					if (ispandigit(nNum) == true) {
						if (nNum > maximum) {
							maximum = nNum;
						}
					}
				}
			}
		}
		System.out.println(maximum);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
