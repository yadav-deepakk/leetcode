package others_11_2022;

import java.util.Scanner;

public class AttackOnKingdom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] out = new int[T];

		for (int i=0;i<T;i++) {
			
			int n, min=Integer.MAX_VALUE, min1=Integer.MAX_VALUE;
			n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0; j<n; j++) {
				arr[j] = sc.nextInt();
				if(min>arr[j]) min = arr[j];
			}
			
			for(int j=0; j<n; j++) {
				if(min1>arr[j] && arr[j]!=min) min1 = arr[j];
			}
			
			out[i] = min1;
			
		}

		// output the result of each test cases 
		for (int j=0; j<T; j++) System.out.println(out[j]);
		
		sc.close();
	}

}
