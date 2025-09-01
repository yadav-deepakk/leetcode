package codeforces_10_2022;

import java.util.Scanner;

public class NextRound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte N,K;
		byte X=0;
		
		N = sc.nextByte();
		K = sc.nextByte();
		
		byte[] arr = inputArr(N, sc);
		byte eligiblity_score = arr[K-1];
		
		for (int i=0;i<N;i++) {
			if (arr[i]!=0 && arr[i]>=eligiblity_score) X++;
		}
			
		
		System.out.println(X);
		
	}
	
	// method to take input an array.
	public static byte[] inputArr(byte N, Scanner sc) {
		byte[] a = new byte[N];
		for (int i=0;i<N;i++) 
			a[i] = sc.nextByte();
		return a;
	}
}