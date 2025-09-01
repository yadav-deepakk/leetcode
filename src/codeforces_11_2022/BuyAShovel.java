package codeforces_11_2022;

import java.util.Scanner;

public class BuyAShovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int r = sc.nextInt();
		// further code goes here...
		int count = 0;
		int i = k;
		while(k!=r && k%10!=0 && (k-r)%10!=0) {
			k += i; 
			count++;			
		}
		
		System.out.println(++count);
		
		sc.close();
	}

}

