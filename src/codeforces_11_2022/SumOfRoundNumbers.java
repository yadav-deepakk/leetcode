package codeforces_11_2022;

import java.util.Scanner;

public class SumOfRoundNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] out_sm_count = new int[T];
		int[][] out_sm = new int[T][4];
		
		for (int i=0;i<T;i++) {
			
			// System.out.println("i=" + i);
			
			out_sm_count[i] = 0;
			for(int j=0; j<out_sm[i].length; j++) out_sm[i][j] = -1; 
			
			int n = sc.nextInt();
			int pos=0, j=0;
			while(n>0){
				int rem = n%10;
				if(rem != 0) {
					// System.out.println("found=" + rem + ", incrementing summands count...");
					out_sm_count[i]++;
					out_sm[i][pos++] = (int) (rem * Math.pow(10, j));
				}
				n/=10;
				j++;
			}
			
		}
		
		for (int j = 0; j < T; j++) {
			
			System.out.println(out_sm_count[j]);
			
			for(int k=0;k<out_sm[j].length; k++) {
				if(out_sm[j][k] == -1) break;
				else System.out.print(out_sm[j][k] + " ");
			}
			System.out.println("");
			
		}
		
		sc.close();
	}
	

}
