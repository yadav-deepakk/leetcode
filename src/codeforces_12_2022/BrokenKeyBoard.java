package codeforces_12_2022;

import java.util.Scanner;

public class BrokenKeyBoard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte t = sc.nextByte();
		
		while(t-->0) {
			byte n = sc.nextByte();
			String word = sc.next();
			
			boolean canType=true, isTwice=false;
			int i=0; 
			while(i<n) {
				if(isTwice) {
					if( i+1>=n || word.charAt(i)!=word.charAt(i+1) ){
						canType = false;
						break;
					}
					i++;
				}
				isTwice = !isTwice;
				i++;
			}
			System.out.println(canType ? "YES":"NO");
		}
		
		sc.close();
	}
}
