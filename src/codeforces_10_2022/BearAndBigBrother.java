package codeforces_10_2022;

import java.util.*;

public class BearAndBigBrother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		int count = 0;
		
		while (a<=b){
			a *= 3;
			b *= 2;
			count++;
		}
		
		System.out.println(count);
		
		sc.close();
		
	}

}
