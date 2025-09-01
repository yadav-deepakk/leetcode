package codeforces_10_2022;

import java.util.Scanner;

public class PetyaAndStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1, s2;
		
		s1 = sc.next();
		s2 = sc.next();
		
		if(s1.compareToIgnoreCase(s2)>0) System.out.println(1);
		else if(s1.compareToIgnoreCase(s2)<0) System.out.println(-1);
		else System.out.println(0);
		
		sc.close();
	}

}
