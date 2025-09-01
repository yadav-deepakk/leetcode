package codeforces_11_2022;

import java.util.Scanner;

public class BalancedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			
			if((n/2)%2!=0 && (n/2)>1)  System.out.println(n+ " NO");
			else {
				long sum=0;
				int[] a = new int[n];
				int i=0;
				while(i++>n/2) {
					a[i] = (i+1) * 2;
					sum += a[i];
				}
				int num = 1;
				while(i-->0) {
					sum -= num;
					a[i] = (i==1) ? (int)sum:num-1;
					num++;
				}
				
				System.out.println(n+ " YES");
				for(int e: a) System.out.print(e+" ");
				System.out.println();
			}
			
		}
		
		sc.close();
	}

}
