//Euler40 Champernowne's constant
package project_euler31_40;

import java.util.ArrayList;

public class Euler40 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int product = 1;
		int[] orderList = {1, 10, (int)Math.pow(10, 2), 
				(int)Math.pow(10, 3), (int)Math.pow(10, 4), 
				(int)Math.pow(10, 5), (int)Math.pow(10, 6)};
		ArrayList<Integer> digitList = new ArrayList<Integer>();
		String nStr = "";
		String nData[];
		
		for (int n = 1; n < (int)Math.pow(10, 6); n++) {
			nStr = Integer.toString(n);
			nData = nStr.split("");
			for (int i = 0; i < nData.length; i++) {
				digitList.add(Integer.parseInt(nData[i]));
			}
		}
		for (int order : orderList) {
			product *= digitList.get(order - 1);
		}
		System.out.println(product);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}