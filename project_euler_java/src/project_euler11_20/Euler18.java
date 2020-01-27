//Euler18 Maximum path sum I
package project_euler11_20;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Euler18 {
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		int maxValue = 0;
		int orderGroup;
		int indexSubGroup;
		int product;
		double num;
		String[] data;
		ArrayList<Integer> dataList = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new FileReader("./Euler18_number.txt"));
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			data = line.split(" ");
			for (int i = 0; i < data.length; i++) {
				dataList.add(Integer.parseInt(data[i]));
			}
		}
		br.close();
		for (int i = 0; i < Math.pow(2, 14); i++) {
			product = dataList.get(0);
			orderGroup = 1;
			indexSubGroup = 0;
			num = i;
			for (int j = 0; j < 14; j++) {
				if (num % 2 == 0) {
					orderGroup++;
					product += dataList.get(orderGroup*(orderGroup - 1) / 2 + indexSubGroup);
					num = Math.floor(num / 2);
				}
				else {
					orderGroup++;
					indexSubGroup++;
					product += dataList.get(orderGroup*(orderGroup - 1) / 2 + indexSubGroup);
					num = Math.floor(num / 2);
				}
			}
			if (product > maxValue) {
				maxValue = product;
			}
		}
		System.out.println(maxValue);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
