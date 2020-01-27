package project_euler1_10;

public class Euler5 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int multiple = 1;
		int temp = 0;
		int k = 0;
		for (int i = 2; i < 21; i++) {
			k = i;
			for (int j = 2; j < i + 1; j++) {
				temp = multiple;
				while (k % j == 0) {
					k = k / j;
					if (temp % j == 0) {
						temp = temp / j;
					}
					else {
						multiple = multiple * j;
					}
				}
			}
		}
		System.out.println(multiple);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 +"seconds");
		System.out.println(endTime - startTime +"ms");
	}
}