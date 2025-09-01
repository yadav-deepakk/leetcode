package codeforces_11_2022;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Character> chars = new HashSet<Character>();
		
		sc.nextInt();
		String s = sc.next().toLowerCase();
		
		for (int i = 0; i < s.length(); i++) {
			chars.add(s.charAt(i));
		}
		
		// System.out.println("length="+ s.length() + ", chars=" + chars + ", size=" + chars.size());
		System.out.println((chars.size() == 26) ? "YES":"NO");
		
		sc.close();
	}

}
