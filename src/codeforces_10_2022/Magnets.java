package codeforces_10_2022;

import java.util.Scanner;

public class Magnets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int n1, n2, group=1;
		n1 = sc.nextInt();
		
		for (int i=1; i<N; i++) {
			n2 = sc.nextInt();
			if(n1 != n2) group++;
			n1 = n2;
		}
		
		System.out.println(group++);
		sc.close();
	}

}
