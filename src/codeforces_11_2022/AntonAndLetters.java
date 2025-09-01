package codeforces_11_2022;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Character> letters = new HashSet<Character>();
		
		String s = sc.nextLine();

		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i)==' ' || s.charAt(i)==',' || s.charAt(i) == '}') continue;
			letters.add(s.charAt(i));
		}
		
		// System.out.println("letters=" + letters + ", size=" + letters.size());
		System.out.println(letters.size());
		
		sc.close();
	}

}
