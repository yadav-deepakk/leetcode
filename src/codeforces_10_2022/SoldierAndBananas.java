package codeforces_10_2022;

import java.util.Scanner;

public class SoldierAndBananas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k, n, w;
		
		k = sc.nextInt();
		n = sc.nextInt();
		w = sc.nextInt();
		
		int cost = 0;
		
		for(int i=1; i<=w; i++) cost+=i*k;
		
		System.out.println((cost-n > 0) ? cost-n : 0);
		
		sc.close();
	}

}
