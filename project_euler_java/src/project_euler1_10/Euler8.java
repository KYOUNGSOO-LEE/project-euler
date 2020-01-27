// Euler8 Largest product in a series
package project_euler1_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Euler8 {
	public static String readFile() throws IOException {
		String numString = "";
		//stream
		BufferedReader numbers = new BufferedReader (new FileReader("./Euler8_number.txt"));
		while (true) {
			String line = numbers.readLine();
			if (line == null) break;
			numString += line;
		}
		numbers.close();
		return numString;
	}
	public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
		String numString = readFile();
		int num = 0;
		double maxProduct = 0;
		double product = 1;
		for (int i = 0; i < numString.length() - 12; i++) {
			for (int j = 0; j < 13; j++) {
				num = Integer.parseInt(numString.substring(i + j, i + j + 1));
				product *= num;
			}
			if (product > maxProduct) {
				maxProduct = product;
			}
			product = 1;
		}
		System.out.println(maxProduct);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
