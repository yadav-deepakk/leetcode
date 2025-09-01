package codeforces_10_2022;

import java.util.Scanner;

public class Tram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		short N = sc.nextShort();
		int capacity = 0, passengers=0;
		
		while(N-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			passengers += (-a + b);
			if (passengers > capacity) capacity = passengers;
			
			// System.out.println("a= " + a + ", b= " + b + ", p= " + passengers + ", c= " + capacity);
		}
		
		System.out.println(capacity);
		sc.close();
	}

}
