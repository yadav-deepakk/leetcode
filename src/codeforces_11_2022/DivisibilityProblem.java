package codeforces_11_2022;

import java.util.Scanner;

public class DivisibilityProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] res = new int[T];
		
		for(int i=0;i<T;i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			res[i] = (a%b == 0) ? 0:(b * ( (a/b) + 1)) - a;
			
		}
		
		for(int j=0; j<T; j++) System.out.println(res[j]);
		
		sc.close();
	}

}
