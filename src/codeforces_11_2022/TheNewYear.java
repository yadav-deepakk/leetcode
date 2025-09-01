package codeforces_11_2022;

import java.util.Scanner;

public class TheNewYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[3];
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();
		
		int min = Math.min(x[0], Math.min(x[1], x[2]));
		int max = Math.max(x[1], Math.max(x[0], x[2]));
		int middle = 0;
		for(int i=0; i<x.length; i++) {
			if(min!=x[i] && max!=x[i]) middle = x[i];
		}
		int d = Math.abs(middle-x[0]) + Math.abs(middle-x[1]) + Math.abs(middle-x[2]);
		System.out.println(d);
		
		sc.close();
	}

}
