package codeforces_10_2022;

import java.util.Scanner;

public class Presents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr_sr = new int[N][2];
		
		for (int i=0; i<N; i++) {
			arr_sr[i][0] = -1;
			arr_sr[i][1] = -1;
		}
		
		for(int j=0; j<N; j++) {
			int temp = sc.nextInt() - 1;
			arr_sr[j][0] = temp; 
			arr_sr[temp][1] = j;
		}
		
		for (int k=0;k<N;k++) {
			System.out.print( (arr_sr[k][1]+1) + " ");
		}
		

	}

}
