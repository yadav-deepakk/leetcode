package others_11_2022;

import java.util.Scanner;

public class ColorTheCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T-->0) {
			
			int n, x1, x2, x3, x4, x5, x6;
			n = sc.nextInt();
			x1 = sc.nextInt();
			x2 = sc.nextInt();
			x3 = sc.nextInt();
			x4 = sc.nextInt();
			x5 = sc.nextInt();
			x6 = sc.nextInt();
			
			long sum = (x1 + x2 + x3 + x4 + x5 + x6); 
			long cost = (n%2==0) ? n*sum/2:(n+1)*sum/2;
			
			System.out.println(cost);
			
		}
		
		sc.close();

	}

}
