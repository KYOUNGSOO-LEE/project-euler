//Euler32 Pandigital products
package project_euler31_40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

public class Euler32 {
	public static Boolean ispandigit(int n) {
		String nStr = Integer.toString(n);
		String data[];
		ArrayList<Integer> nList = new ArrayList<Integer>();
		data = nStr.split("");
		for (int i = 0; i < nStr.length(); i++) {
			nList.add(Integer.parseInt(data[i]));
		}
		Collections.sort(nList);
		for (int i = 0; i < 9; i++) {
			if (nList.get(i) != i + 1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int result = 0;
		HashSet<Integer> resultList = new HashSet<Integer>();
		for(int n = 0; n < 2; n++) {
			for (int i = (int) Math.pow(10, n); i < (int) Math.pow(10, n + 1); i++) {
				for (int j = (int) Math.pow(10, 3 - n); j < (int) Math.pow(10, 4 - n); j++) {
					int k = i * j;
					if (k < Math.pow(10, 4)) {
						if (ispandigit(Integer.parseInt(
								Integer.toString(i)+Integer.toString(j)+Integer.toString(k)
								)) == true) {
							resultList.add(k);
						}
					}
				}
			}
		}
		for (int n : resultList) {
			result += n;
		}
		System.out.println(result);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
