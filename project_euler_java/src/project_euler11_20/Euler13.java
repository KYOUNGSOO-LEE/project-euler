//Euler13 Large sum
package project_euler11_20;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Euler13 {
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		double dig = 0;
		double sum = 0;
		double result = 0;
		BufferedReader br = new BufferedReader(new FileReader("./Euler13_number.txt"));
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			sum += Double.parseDouble(line);
		}
		br.close();
		dig = Math.floor(Math.log10(sum)) + 1;
		result = Math.floor(sum / Math.pow(10, dig - 10)); 
		System.out.println((long)result);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
