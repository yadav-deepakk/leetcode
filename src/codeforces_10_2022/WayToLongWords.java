package codeforces_10_2022;

import java.util.Scanner;

public class WayToLongWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		byte N = sc.nextByte();
		
		String[] out = new String[N];
		String s;
		
		for(int i=0; i<N; i++){
			s = sc.next();
			if (s.length()>10)
				out[i] = s.substring(0,1) + (s.length()-2) + s.substring(s.length()-1, s.length());
			else out[i] = s;
		}
				
		for (int j=0;j<N;j++) {
			System.out.println(out[j]);
		}
		
		
		sc.close();
	}

}
