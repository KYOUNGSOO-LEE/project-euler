// Euler1 Multiples of 3 and 5
package project_euler1_10;

public class Euler1 {
	public static void main(String[] args){
		int sum = 0;
		long startTime = System.currentTimeMillis();
		for(int i=1; i<1000; i++){
			if(i % 3 == 0 || i % 5 == 0){
				sum += i;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println((double)(endTime - startTime)/(double)1000 +"seconds");
		System.out.println((endTime - startTime) +"ms");
	}
}