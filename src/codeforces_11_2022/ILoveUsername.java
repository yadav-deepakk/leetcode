package codeforces_11_2022;

import java.util.Scanner;

public class ILoveUsername {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		int max, min;
		int temp = sc.nextInt();
		min = max = temp;
		int count=0;
		
		for (int i=1; i<n; i++) {
			
			temp = sc.nextInt();
			if(temp>max) {
				count++;
				max = temp;
			}
			if(temp<min) {
				count++;
				min = temp;
			}
			
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
