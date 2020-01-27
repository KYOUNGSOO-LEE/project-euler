//Euler17 Number letter counts
package project_euler11_20;

import java.util.ArrayList;

public class Euler17 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] tens = {3, 6, 6, 5, 5, 5, 7, 6, 6};
		int[] digits = {3, 3, 5, 4, 4, 3, 5, 5, 4};
		//teens = {6, 6, 8, 8, 7, 7, 9, 8, 8};
		int[] hundreds = {10, 10, 12, 11, 11, 10, 12, 12, 11};
		int[] first19 = {3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 7, 9, 8, 8};
		//1-19
		for (int i = 0; i < 19; i++) {
			list.add(first19[i]);
		}
		//20-99
		for (int i = 1; i < 9; i++) {
			list.add(tens[i]);
			for(int j = 0; j < 9; j++) {
				list.add(tens[i] + digits[j]);
			}
		}
		//100-999
		for (int i = 0; i < 9; i++) {
		    list.add(hundreds[i]);
		    for (int j = 0; j < 99; j++) {
		        list.add(hundreds[i] + 3 + list.get(j));
		    }
		}
		//1000
		list.add(3 + 8);
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime) / (double)1000 + "seconds");
	}
}
