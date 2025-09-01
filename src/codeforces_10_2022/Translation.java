package codeforces_10_2022;

import java.util.Scanner;

public class Translation {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean flag=false;
		
		if(s.length() == t.length()) {
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) != t.charAt(t.length() -i-1)) {
					flag=false;
					break;
				}
				flag = true;
			}
		}
		System.out.println(flag ? "YES":"NO");
		sc.close();
		
    }
}

