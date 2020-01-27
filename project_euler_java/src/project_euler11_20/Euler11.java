//Euler11 Largest product in a grid
package project_euler11_20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Euler11 {
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		int mult = 1;
		String[] data;
		ArrayList<Integer> dataList = new ArrayList<Integer>();
		ArrayList<Integer> mults = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader (new FileReader("./Euler11_number.txt"));
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			data = line.split(" ");
			for (int i = 0; i < data.length; i++)
			{
				dataList.add(Integer.parseInt(data[i]));
			}
		}
		br.close();
		//Horisontal
		for (int i = 0; i < 397; i++) {
			if (i % 20 < 17) {
				mult = 1;
				for (int j = 0; j < 4; j++) {
					mult *= dataList.get(i + j);
				}
				mults.add(mult);
			}
		}
		//Verticle
		for (int i = 0; i < 340; i++) {
			mult = 1;
			for (int j = 0; j < 4; j++) {
				mult *= dataList.get(i + 20 * j);
			}
			mults.add(mult);
		}
		//Diagonal
		for (int i = 0; i < 337; i++) {
			if (i % 20 < 17) {
				mult = 1;
				for (int j = 0; j < 4; j++) {
					mult *= dataList.get(i + 21 * j);
				}
				mults.add(mult);
			}
		}
		//Antidiagonal
		for (int i = 0; i < 340; i++) {
			if (i % 20 > 2) {
				mult = 1;
				for (int j = 0; j < 4; j++) {
					mult *= dataList.get(i + 19 * j);
				}
				mults.add(mult);
			}
		}
		Collections.sort(mults);
		System.out.println(mults.get(mults.size()-1));
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
