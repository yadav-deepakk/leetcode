package codeforces_11_2022;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Horseshoe {

	public static void main(String[] args) {
		Set<Integer> c_set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);		
		
		for (int i = 0; i <= 3; i++) c_set.add(sc.nextInt());
		System.out.println(4 - c_set.size());
		
		sc.close();

	}

}
