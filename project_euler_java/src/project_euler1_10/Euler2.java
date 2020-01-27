// Euler2 Even fibonacci numbers
package project_euler1_10;

public class Euler2 {
	public static void main(String[] args) {
		int i = 1;
		int limit = 4000000;
		int sum = 0;
		long startTime = System.currentTimeMillis();
		
		while (fibonacci(i) < limit) {
			if (fibonacci(i) % 2 == 0) {
				sum += fibonacci(i);
			}
			i++;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println((double)(endTime - startTime)/(double)1000 +"seconds");
		System.out.println((endTime - startTime) +"ms");
	}
	public static int fibonacci(int n) {
		if(n==1) {
			return 1;
		}else if (n==2) {
			return 2;
			}
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
}