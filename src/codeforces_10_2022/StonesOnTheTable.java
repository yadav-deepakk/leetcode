package codeforces_10_2022;

import java.util.Scanner;

public class StonesOnTheTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		String S = sc.next();
		int count = 0;
		
		for (int i = 1; i < S.length(); i++) {
			char prev_ch = S.charAt(i-1);
			char current_ch = S.charAt(i);
			
			if (prev_ch == current_ch) count++;
			
		}
		
		System.out.println(count);
		
		
		sc.close();
	}

}
