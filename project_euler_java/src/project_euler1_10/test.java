package project_euler1_10;

import java.util.ArrayList;
import java.util.Collections;

public class test {
	public static Boolean isprime(int n) {
		if (n == 0 || n == 1) {
			return false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
		
	}
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
	public static String swap(String s, int i, int j) {
		int temp;
		String nstr="";
		String nData[];
		ArrayList<Integer> nList = new ArrayList<Integer>();
		nData = s.split("");
		for (int k = 0; k < nData.length; k++) {
			nList.add(Integer.parseInt(nData[k]));
		}
		temp = nList.get(i);
		nList.set(i, nList.get(j));
		nList.set(j, temp);
		for (int num : nList) {
			nstr += Integer.toString(num);
		}
		return nstr;
	}
	public static String undersort(String s, int i) {
		String nstr = "";
		String nData[];
		ArrayList<Integer> nList1 = new ArrayList<Integer>();
		ArrayList<Integer> nList2 = new ArrayList<Integer>();
		nData = s.split("");
		for (int k = 0; k < i; k++) {
			nList1.add(Integer.parseInt(nData[k]));
		}
		for (int k = i; k < nData.length; k++) {
			nList2.add(Integer.parseInt(nData[k]));
		}
		Collections.sort(nList2);
		nList1.addAll(nList2);
		for (int num : nList1) {
			nstr += Integer.toString(num);
		}
		return nstr;
	}
	public static String lexico(String s) {
		int lenStr = s.length();
		String nStr = "";
		String nData[];
		ArrayList<Integer> nList = new ArrayList<Integer>();
		nData = s.split("");
		for (int k = 0; k < nData.length; k++) {
			nList.add(Integer.parseInt(nData[k]));
		}
		for (int i = lenStr - 2; i > -1; i--) {
			for (int j = lenStr - 1; j > i; j--) {
				if (nList.get(i) < nList.get(j)) {
					nStr = swap(s, i, j);
					nStr = undersort(nStr, i + 1);
				}
			}
		}
		return nStr;
	}
	public static void main(String[] args) {
		System.out.println(undersort("54321", 3));

	}
}