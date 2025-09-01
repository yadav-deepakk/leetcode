package codeforces_11_2022;

import java.util.Scanner;

public class ArrivalOfTheGeneral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		N = sc.nextInt();
		
		int[] q = new int[N];
		
		for(int i=0; i<N; i++) {
			q[i] = sc.nextInt();
			if(q[i]>max) max = q[i];
			if(q[i]<min) min = q[i]; 
		}
		
		int pos_max = 0;
		while(q[pos_max] != max) {
			pos_max++;
			if(q[pos_max] == max) break;
		}
		
		int pos_min = N-1;
		while(q[pos_min] != min) {
			pos_min--;
			if(q[pos_min] == min) break;
		}
		
		int moves = Math.abs(0-pos_max) + Math.abs(N-1-pos_min);
		
		System.out.println((pos_max > pos_min) ? moves-1 : moves);
		
		sc.close();
	}

}
