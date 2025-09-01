package love_bubbers_450;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(reverseString(s));
				
		sc.close();
	}
	
	public static String reverseString(String s) { 
		int last = s.length()-1;
		String rev_s = "";
		while(last>=0) rev_s += s.charAt(last--);
		return rev_s;
	}

}
