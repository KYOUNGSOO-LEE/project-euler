//Euler41 Pandigital prime
package project_euler41_50;

import java.util.ArrayList;
import java.util.Collections;

public class Euler41 {
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
		int check = 0;
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
					check = 1;
					break;
				}
			}
			if (check == 1) {
				break;
				
			}
		}
		return nStr;
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String nStr = "1234567";
		int cStr = factorial(nStr.length());
		ArrayList<Integer> panList = new ArrayList<Integer>();
		panList.add(1234567);
		for (int i = 1; i < cStr; i++) {
			nStr = lexico(nStr);
			panList.add(Integer.parseInt(nStr));
		}
		for (int i = cStr; i > 1; i--) {
			if (isprime(panList.get(i - 1))) {
				System.out.println(panList.get(i - 1));
				break;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
