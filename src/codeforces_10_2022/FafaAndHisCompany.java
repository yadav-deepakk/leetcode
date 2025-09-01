package codeforces_10_2022;

import java.util.Scanner;

public class FafaAndHisCompany {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X=0;
		
		for (int l=1;  l<=N/2; l++) {
			// System.out.println("i="+i);
			if(N%l == 0) {
				// System.out.println("incrementing X\'s for i="+ i);
				X++;
			}
		}
		
		System.out.println(X);
		sc.close();
	}

}
