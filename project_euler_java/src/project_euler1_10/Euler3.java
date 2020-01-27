// Euler3 Largest prime factor
package project_euler1_10;

public class Euler3 {
	public static void main(String[] args) {
		long num = 600851475143L;
		int i = 2;
		long startTime = System.currentTimeMillis();
		
		while (i < num / 2 + 1) {
		    while (num % i == 0) {
		       num = num / i;
		       if (num == 1) {
		    	   num = i;
		    	   break;
		       }
		    }
		    i ++;
		}
		System.out.println(num);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 +"seconds");
		System.out.println((endTime - startTime) +"ms");
	}
}