package codeforces_10_2022;

import java.util.Scanner;


public class BitPlusPlus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Short t, X=0;
		t = sc.nextShort();
		
		while(t-->0) {
			String operation;
			operation = sc.next();
			if (operation.charAt(1) == '+') X++;
			if (operation.charAt(1) == '-')	X--;
		}
		
		System.out.println(X);
		sc.close();
	}

}
