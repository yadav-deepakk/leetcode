package codeforces_10_2022;


import java.util.Scanner;

public class WordCapitalization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s.substring(0,1).toUpperCase() + s.substring(1, s.length()));
		sc.close();
	}

}
