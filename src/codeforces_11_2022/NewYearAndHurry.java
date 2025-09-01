package codeforces_11_2022;

import java.util.Scanner;

public class NewYearAndHurry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nq, t, rem_time, count=0;
		nq = sc.nextInt(); 					// number of questions 
		t = sc.nextInt();  					// time to reach party location in minutes
		rem_time = ((24-20) * 60) - t;			// denotes time left to solve given problems.
		
		for (int i=1; i<=nq; i++) {
			int tq = 5*i;
			if(rem_time>=tq) {
				count++;
				rem_time -= tq; 
			}
			else break;
		}
		System.out.println(count);
		sc.close();
	}

}
