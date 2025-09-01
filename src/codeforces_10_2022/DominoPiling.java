package codeforces_10_2022;

import java.util.Scanner;

public class DominoPiling {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte M,N;
		
		M = sc.nextByte();
		N = sc.nextByte();
		
		System.out.println((M*N) / 2);
		sc.close();
	}
}
