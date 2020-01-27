//Euler19 Counting Sunday
package project_euler11_20;

public class Euler19 {
	public static void main(String[] args) {
		int days = 1;
		int count = 0;
		long startTime = System.currentTimeMillis();
		for (int i = 1900; i < 2001; i++) {
			for (int j = 1; j < 13; j++) {
				switch(j) {
					case 1: case 3: case 5: case 7: case 8: case 10: case 12:
						days += 31; break;
					case 4: case 6: case 9: case 11:
						days += 30; break;
					case 2:
						if(i % 4 == 0 && i != 1900) {
						days += 29;
						} else {
							days += 28;
						} break;
				}
				if (days % 7 == 0 && i > 1900) {
					count++;
				}
			}
		}
		System.out.println(count);
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime - startTime)/(double)1000 + "seconds");
	}
}
