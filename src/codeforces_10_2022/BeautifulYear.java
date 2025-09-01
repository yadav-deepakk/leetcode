package codeforces_10_2022;

import java.util.Scanner;
import java.util.Vector;

public class BeautifulYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		while( !isDistinctYear(++year) ) ;
		
		System.out.println(year);
		sc.close();
	}
	
	public static boolean isDistinctYear(int year) {
		Vector<Integer> v = new Vector<Integer>();
		boolean flag = true;
		while(year>0) {
			int last_digit = year%10;
			if(v.contains(last_digit)) {
				flag = false;
				break;
			}else {
				v.add(last_digit);
			}
			year /= 10;
		}
		return flag;
	}

}
