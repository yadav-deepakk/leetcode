package codeforces_11_2022;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class IWannaBeTheGuy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,p,q;
		n = sc.nextInt();
		Set<Integer> levels = new HashSet<Integer>();
		
		p = sc.nextInt();
		for(int i=0; i<p; i++) levels.add(sc.nextInt());

		q = sc.nextInt();
		for(int i=0; i<q; i++) levels.add(sc.nextInt());
		
		System.out.println((levels.size()==n) ? "I become the guy.":"Oh, my keyboard!");
		System.out.println("size="+levels.size());
		
		sc.close();
	}

}
