//Euler36 Double-base palindromes
package project_euler31_40;

import java.util.ArrayList;
import java.util.Collections;

public class Euler36 {
	public static Boolean ispalindrome2(int n) {
		ArrayList<Integer> nList = new ArrayList<Integer>();
		ArrayList<Integer> rnList = new ArrayList<Integer>();
		while(true) {
			nList.add(Math.floorMod(n, 2));
			n = Math.floorDiv(n, 2);
			if (n == 0) {
				break;
			}
		}
		rnList.addAll(nList);
		Collections.reverse(rnList);
		for (int i = 0; i < nList.size(); i++) {
			if (nList.get(i) != rnList.get(i)) {
				return false;
			}
		}
		return true;
	}
	public static Boolean ispalindrome10(int n) {
		ArrayList<Integer> nList = new ArrayList<Integer>();
		ArrayList<Integer> rnList = new ArrayList<Integer>();
		while(true) {
			nList.add(Math.floorMod(n, 10));
			n = Math.floorDiv(n, 10);
			if (n == 0) {
				break;
			}
		}
		rnList.addAll(nList);
		Collections.reverse(rnList);
		for (int i = 0; i < nList.size(); i++) {
			if (nList.get(i) != rnList.get(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int sumPalindrome = 0;
		for (int n = 0; n < Math.pow(10, 6); n++) {
			if (ispalindrome2(n) == true && ispalindrome10(n) == true) {
				sumPalindrome += n;
			}
		}
		System.out.println(sumPalindrome);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
