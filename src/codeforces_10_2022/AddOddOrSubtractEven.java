package codeforces_10_2022;


import java.util.Scanner;

public class AddOddOrSubtractEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] out = new int[T];
		
		for (int i=0;i<T;i++) {
			
			int A, B;
			A = sc.nextInt();
			B = sc.nextInt();
			
			int diff = A-B;
			if (diff<0) out[i] = (Math.abs(diff)%2==0) ? 2: 1;
			else if (diff>0) out[i] = (diff%2==0) ? 1: 2;
			else out[i] = 0;
			
		}
		
		for (int j = 0; j < T; j++) System.out.println(out[j]);
		
		sc.close();
	}

}
