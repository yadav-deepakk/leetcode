package codeforces_11_2022;

import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0) {
			// write code to process each test case here...
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			int moves = Math.abs(a-b)/10;
			moves += (Math.abs(a-b)%10 != 0 && a!=b) ? 1:0;
			System.out.println(moves);
		}
		
		sc.close();
	}

}
