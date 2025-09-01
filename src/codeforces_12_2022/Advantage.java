package codeforces_12_2022;

import java.util.Scanner;

public class Advantage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int m1=Integer.MIN_VALUE, m2=Integer.MIN_VALUE, mi=0, mj=0;
			// finding max1, it's index mi and max2 and It's index mj
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
				if(arr[i]>m1) {
					m1 = arr[i];
					mi = i; 
				}
			}
			for(int i=0;i<n;i++) {
				if(arr[i]>m2 && arr[i]!=arr[mi] && mj!=i) {
					m2 = arr[i];
					mj = i;
				}
			}
			
			// System.out.println("m1=" + m1 + " mi=" + mi + " m2=" + m2 + " mj=" + mj);
			// printing difference 
			for(int i=0; i<n; i++) {
				if(mi == i) System.out.print(arr[i] - arr[mj]);
				else System.out.print(arr[i] - arr[mi]);
				if(i<n-1)System.out.print(" ");
			}
			
			if(t>0) System.out.println();
		}
		
		sc.close();

	}

}
