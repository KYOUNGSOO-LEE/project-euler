//Euler34 Digit factorials
package project_euler31_40;

public class Euler34 {
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int result = 0; 
		int sumFact = 0;
		int div = 0;
		int r = 0;
		int factorialList[] = new int[10];
		for (int i = 0; i < 10; i++) {
			factorialList[i] = factorial(i);
		}
		for (int n = 3; n < Math.pow(10, 7); n++) {
			sumFact = 0;
			div = n;
			while(true) {
				if (div > 0) {
					r =  Math.floorMod(div, 10);
					div = Math.floorDiv(div, 10);
					sumFact += factorialList[r];
				} else {
					break;
				}
			}
			if (n == sumFact) {
				result += n;
			}
		}
		System.out.println(result);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
