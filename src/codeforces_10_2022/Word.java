package codeforces_10_2022;

import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		byte uc=0, lc=0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='a' && s.charAt(i)<='z') lc++;
			else if (s.charAt(i)>='A' && s.charAt(i)<='Z') uc++;
		}
		
		System.out.println((lc<uc) ? s.toUpperCase() : s.toLowerCase());
				
		sc.close();
	}

}
