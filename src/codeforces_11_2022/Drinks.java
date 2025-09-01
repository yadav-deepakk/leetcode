package codeforces_11_2022;

import java.util.Scanner;

public class Drinks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum=0;
		for (int i=0; i<n; i++) {
			sum+=sc.nextInt();
		}
		
		System.out.println((double) sum/n);
		
		sc.close();
		
	}

}
