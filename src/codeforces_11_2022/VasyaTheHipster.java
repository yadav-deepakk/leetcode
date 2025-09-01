package codeforces_11_2022;

import java.util.Scanner; 
public class VasyaTheHipster {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r, b;
		r = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(Math.min(r, b) + " " + Math.abs(r-b)/2);
		
		sc.close();
	}

}
