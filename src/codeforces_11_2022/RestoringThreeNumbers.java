package codeforces_11_2022;

import java.util.Scanner;

public class RestoringThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[4];
		int max = Integer.MIN_VALUE;
		for (int i=0; i<4; i++) {
			x[i] = sc.nextInt();
			if(x[i]>max) max = x[i];
		}
		
		for (int i=0; i<4; i++) if(max>x[i]) System.out.print(max-x[i] + " ");
		
		sc.close();
	}

}
