//Euler35 Circular primes
package project_euler31_40;

import java.util.ArrayList;

public class Euler35 {
	public static Boolean isprime(int n) {
		for (int i = 2; i < Math.sqrt(n) + 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int circular(int n) {
		int firstNum;
		String nStr = "";
		String data[];
		ArrayList<Integer> nList1 = new ArrayList<Integer>();
		ArrayList<Integer> nList2 = new ArrayList<Integer>();

		nStr = Integer.toString(n);
		data = nStr.split("");
		for (int i = 0; i < data.length; i++) {
			nList1.add(Integer.parseInt(data[i]));
		}
		firstNum = nList1.get(0);
		nList2.addAll(nList1.subList(1, nList1.size()));
		nList2.add(firstNum);
		n = 0;
		for (int i = 0; i < nList2.size(); i++) {
			n = n * 10 + nList2.get(i);
		}
		return n;
	}
	public static Boolean iscircularprime(int n) {
		int count = 0;
		int digit = (int) Math.log10(n) + 1;
		int div = 0;
		int r = 0;
		div = n;
		for (int i = 0; i < digit; i++) {
			r = Math.floorMod(div, 10);
			if (r == 0) {
				return false;
			}
			div = Math.floorDiv(div, 10);
		}
		for (int i = 0; i < digit; i++) {
			if (isprime(n) == false) {
				break;
			}
			n = circular(n);
			count ++;
		}
		if (count == digit) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		resultList.add(2);
		for (int n = 3; n < Math.pow(10, 6); n += 2) {
			if (iscircularprime(n) == true) {
				resultList.add(n);
			}
		}
		System.out.println(resultList.size());
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
