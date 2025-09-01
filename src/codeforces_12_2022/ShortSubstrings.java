package codeforces_12_2022;

import java.util.Scanner;

public class ShortSubstrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			String s="", sub_s;
			sub_s = sc.next();
			int i=0;
			while(i<sub_s.length()) {
				s+=sub_s.charAt(i);
				i+=2;
			}
			s+=sub_s.charAt(sub_s.length()-1);
			System.out.println(s);
		}
		
		sc.close();
	}

}
