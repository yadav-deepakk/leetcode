package codeforces_11_2022;

import java.util.Scanner;

public class Hulk {

	public static void main(String[] args) {
		// I hate it love it that
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.print("I ");
			System.out.print(((i)%2 == 0) ? "love":"hate");
			System.out.print((i==n) ? " it ":" that ");
		}
		
		sc.close();

	}

}
