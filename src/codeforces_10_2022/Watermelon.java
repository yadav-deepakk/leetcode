package codeforces_10_2022;

import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		byte W = sc.nextByte();
		System.out.println( (W>2 && W%2==0) ? "YES":"NO");
		
		sc.close();
	}

}
