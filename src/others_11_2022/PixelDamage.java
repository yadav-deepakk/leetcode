package others_11_2022;

import java.util.Scanner;

public class PixelDamage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		boolean[] out = new boolean[T];
		
		for (int i=0;i<T;i++) {
			// write code to process each test case here...
			int x1, x2, y1, y2, k;
			y1 = sc.nextInt();
			x1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			k = sc.nextInt();
			
			int d = (int) Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));
			
			out[i] = d<k;
		}
		
		// output the result of each test cases 
		for (int j = 0; j < T; j++) System.out.println(out[j]? 1:0);
		
		sc.close();
	}

}
