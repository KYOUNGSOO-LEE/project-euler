//Euler42 Coded triangle numbers
package project_euler41_50;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Euler42 {
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		int count = 0;
		String data[];
		ArrayList<Integer> triNumList = new ArrayList<Integer>();
		ArrayList<String> dataList = new ArrayList<String>();
		BufferedReader br = new BufferedReader (new FileReader("./Euler42_words.txt"));
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			data = line.split(",");
			for (int i = 0; i < data.length; i++) {
				dataList.add(data[i].substring(1, data[i].length() - 1));
			}
		}
		br.close();
		for (int i = 1; i < 100; i++) {
			triNumList.add((int)(0.5 * i * (i + 1)));
		}
		for (String word : dataList) {
			int lenWord = word.length();
			int sumAscii = 0;
			for (int i = 0; i < lenWord; i++) {
				sumAscii += word.charAt(i) - 64;
			}
			if (triNumList.contains(sumAscii)) {
				count ++;
			}
		}
		System.out.println(count);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
