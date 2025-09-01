package templates;

import java.util.Scanner;

public class ArrayInput {
	
	// main method 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = inputArr(N, sc);
				
		sc.close();
	}
	
	
	
	/*-----------------------------------------
	 * 		Methods to take input array 
	 * ----------------------------------------*/
	public static int[] inputArr(int N, Scanner sc) {
		int[] a = new int[N];
		for (int i=0;i<N;i++) 
			a[i] = sc.nextInt();
		return a;
	}
	
}
