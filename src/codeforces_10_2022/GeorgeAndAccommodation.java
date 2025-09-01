package codeforces_10_2022;

import java.util.Scanner;

public class GeorgeAndAccommodation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int i = 0;
		while(i++ < N) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			if (q-p >= 2) count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
