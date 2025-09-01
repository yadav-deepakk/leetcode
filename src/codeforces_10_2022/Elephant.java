package codeforces_10_2022;

import java.util.Scanner;

public class Elephant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		System.out.println((X%5 == 0) ? X/5 : X/5 + 1);
		sc.close();
	}

}
