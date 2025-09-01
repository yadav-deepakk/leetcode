package codeforces_11_2022;

import java.util.Scanner;

public class PoliceRecruits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p=0, c=0;
		for(int i=0; i<n; i++) {
			
			int temp = sc.nextInt();
			p = temp>0 ? p+temp:p;
			if(p>0 && temp == -1) p--;
			else if(p==0 && temp == -1) c++;
			
			
		}
		
		System.out.println(c);
		sc.close();
	}

}
