package codeforces_10_2022;

import java.util.Scanner;

public class VanyaAndFence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int h = sc.nextInt();
		int[] arr = inputArr(N, sc);
		int count=0;
		
		for(int i=0; i<N; i++) {
			if(arr[i] > h) count++;
		}
		
		System.out.println(N+count);
		
		sc.close();
	}

	public static int[] inputArr(int N, Scanner sc) {
		int[] a = new int[N];
		for (int i=0;i<N;i++) 
			a[i] = sc.nextInt();
		return a;
	}
		
}
