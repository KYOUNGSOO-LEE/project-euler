//Euler22 Names scores
package project_euler21_30;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Euler22 {
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		int sum = 0;
		int lenName;
		int valueChar;
		String data[];
		ArrayList<String> dataList = new ArrayList<String>();
		BufferedReader br = new BufferedReader (new FileReader("./Euler22_names.txt"));
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			data = line.split(",");
			for (int i = 0; i < data.length; i++) {
				dataList.add(data[i].substring(1, data[i].length() - 1));
			}
		}
		br.close();
		Collections.sort(dataList);
		for (int i = 0; i < dataList.size(); i++) {
			lenName = dataList.get(i).length();
			valueChar = 0;
			for (int j = 0; j < lenName; j++) {
				valueChar += (int) dataList.get(i).charAt(j) - 64;
			}
			sum += valueChar * (i + 1);
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
