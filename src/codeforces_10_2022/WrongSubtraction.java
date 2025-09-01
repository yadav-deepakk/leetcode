package codeforces_10_2022;

import java.util.Scanner;
public class WrongSubtraction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, k;
		n = sc.nextInt();
		k = sc.nextInt();
		// System.out.println(n);
		
		for(int i=k; i>0; i--) {
			n = (n%10==0) ? n=n/10 : n-1;
			// System.out.println("i=" + i + " n=" + n);
		}
		System.out.println(n);
		
		sc.close();
	}

}
