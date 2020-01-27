//Euler24 Lexicographic permutations
package project_euler21_30;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Euler24 {
	public static String swap(String s, int i, int j) {
		String nStr = "";
		String data[];
		ArrayList<String> dataList = new ArrayList<String>();
		data = s.split("");
		for (int k = 0; k < data.length; k++) {
			dataList.add(data[k]);
		}
		Collections.swap(dataList, i, j);
		for (int k = 0; k < dataList.size(); k++) {
			nStr += dataList.get(k);
		}
		return nStr;
	}
	public static String undersort(String s, int i) {
		String nStr = "";
		String data[];
		ArrayList<String> dataList = new ArrayList<String>();
		data = s.split("");
		for (int k = 0; k < data.length; k++) {
			dataList.add(data[k]);
		}
		List<String> dataList1 = dataList.subList(0, i);
		List<String> dataList2 = dataList.subList(i, dataList.size());
		Collections.sort(dataList2);
		dataList1.addAll(dataList2);
		for (int k = 0; k < dataList1.size(); k++) {
			nStr += dataList1.get(k);
		}
		return nStr;
	}
	public static String lexico(String s) {
		String nStr ="";
		int maxIdx = s.length() - 1;
		for (int i = maxIdx - 1; i > -1; i--) {
			for (int j = maxIdx; j > i; j--) {
				if (Integer.parseInt("" + s.charAt(i)) < Integer.parseInt("" + s.charAt(j))) {
					nStr = swap(s, i, j);
					nStr = undersort(nStr, i + 1);
					return nStr;
				}
			}
		}
		return nStr;
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String nStr = "0123456789";
		for (int i = 0; i < Math.pow(10, 6) - 1; i++) {
			nStr = lexico(nStr);
		}
		System.out.println(nStr);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
