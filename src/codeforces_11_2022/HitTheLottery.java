package codeforces_11_2022;

import java.util.Scanner;

public class HitTheLottery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 5, 10, 20, 100};
		
		int n = sc.nextInt();
		int count = 0;
		
		while (n>0) {
			int pos = arr.length;
			while(arr[--pos]>n) continue;
		 
			// System.out.println("Found " + arr[pos] + ", removing it from n=" + n);
			n = n-arr[pos];
			count++;
			
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
