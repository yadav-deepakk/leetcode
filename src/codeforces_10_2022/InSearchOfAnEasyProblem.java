package codeforces_10_2022;

import java.util.Scanner;

public class InSearchOfAnEasyProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		int i = 0;
		while (i++ < n) if(sc.nextInt() == 1) flag = true;
		
		System.out.println( !flag ? "EASY":"HARD");
		
		sc.close();
	}

}
