//Euler39 Integer right triangles
package project_euler31_40;

public class Euler39 {
	public static Boolean ispythatriple(int p, int i, int j) {
		if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(p - (i + j), 2)){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int count = 0;
		int maxCount = 0;
		int maxP = 0;
		for (int p = 3; p < 1001; p++) {
			count = 0;
			for (int i = 1; i < Math.floorDiv(p, 3) + 1; i++) {
				for (int j = i; j < Math.floorDiv(p - i, 2) + 1; j++) {
					if (ispythatriple(p, i, j) == true) {
						count ++;
					}
				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxP = p;
			}
		}
		System.out.println(maxP);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
