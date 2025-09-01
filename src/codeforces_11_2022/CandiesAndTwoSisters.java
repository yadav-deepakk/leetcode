package codeforces_11_2022;

import java.util.Scanner;

public class CandiesAndTwoSisters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] out = new int[T];
		
		for (int i=0;i<T;i++) {
			// write code to process each test case here...
			int n = sc.nextInt();
			if(n%2==0) out[i] = (n/2) - 1;
			else out[i] = (n/2);
			
		}
		
		// output the result of each test cases 
		for (int j = 0; j < T; j++) System.out.println(out[j]);
		
		sc.close();

	}

}
