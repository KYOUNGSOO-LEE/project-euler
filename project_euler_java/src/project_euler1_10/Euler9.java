//PE9 Special Pythagorean triplet
package project_euler1_10;

public class Euler9 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		double k = 0;
		for (int i = 1; i < 334; i++) {
			for (int j = i; j < 500; j++) {
				k = Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));
				if (k == (int)k && i+j+k == 1000) {
					System.out.println(i * j * k);	
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
