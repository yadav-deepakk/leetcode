package codeforces_10_2022;

import java.util.Scanner;

public class QueueAtTheSchool {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); 
		int t = sc.nextInt();
		String s = sc.next();
		char[] queue = new char[N];
		
		for(int i=0; i<N; i++) {
			queue[i] = s.charAt(i);
		}
		
		for (int i=0; i<t; i++) {
			
			for(int j=1;j<N;j++) {
				if(queue[j-1]=='B' && queue[j]=='G') {
					queue[j-1] = 'G';
					queue[j++] = 'B';
				}
			}
			
		}
		
		for(int i=0; i<N; i++) System.out.print(queue[i]);
		
		sc.close();
	}
	

}
