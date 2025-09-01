package codeforces_10_2022;

import java.util.Scanner;
import java.util.Vector;

public class BoyOrGirl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		Vector<Character> v = new Vector<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(v.contains(s.charAt(i))) continue;
			else v.add(s.charAt(i));			
		}
		
		String out_s = v.size()%2 != 0 ? "IGNORE HIM!": "CHAT WITH HER!";
		System.out.println(out_s);
		sc.close();
	}

}
