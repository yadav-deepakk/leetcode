package codeforces_10_2022;

import java.util.Scanner;

public class HelpfulMaths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		
		byte count_1=0, count_2=0, count_3=0;
		
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == '+') continue;
			else if(s1.charAt(i) == '1') count_1++;
			else if(s1.charAt(i) == '2') count_2++;
			else if(s1.charAt(i) == '3') count_3++;
		}

		String output_string = "";
		
		while(count_1-->0) output_string += "1+"; 
		while(count_2-->0) output_string += "2+"; 
		while(count_3-->0) output_string += "3+"; 
		
		System.out.println(output_string.substring(0, output_string.length()-1));
		
		sc.close();
		
	}

}
