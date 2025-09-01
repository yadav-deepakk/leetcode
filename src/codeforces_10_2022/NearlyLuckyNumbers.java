package codeforces_10_2022;

import java.util.Scanner;

public class NearlyLuckyNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		byte count=0;
		
		while (N>0) {
			byte d = (byte) (N%10);
			if(isLuckyDigit(d)) count++;
			N/=10;
		}
		
		System.out.println( isLuckyDigit(count) ?  "YES": "NO");
		
		sc.close();
	}
	
	public static boolean isLuckyDigit(byte digit) {
		return (digit==4 || digit==7) ? true : false;
	}
}
