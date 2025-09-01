package codeforces_10_2022;

import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short N = sc.nextShort();
		short S=0;
		
		while(N-->0) {
			
			byte count = 0;
			for(int i=0;i<3;i++) {
				count += sc.nextByte();
			}
			if(count>=2) S++;
		}
		
		System.out.println(S);
		
		sc.close();
	}

}
