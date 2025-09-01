package codeforces_11_2022;

import java.util.Scanner;

public class ChoosingTeams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, k;
		n = sc.nextInt();
		k = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<n; i++) if(sc.nextInt()+k <= 5) count++;
		
		System.out.println(count/3);
		
		sc.close();
	}

}
