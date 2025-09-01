package codeforces_10_2022;

import java.util.Scanner;

public class AntonAndDanik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		String s = sc.next();
		int A=0,D=0;
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'A')
				A++;
			else D++;
		}
		System.out.println(A>D ? "Anton": (D>A ? "Danik": "Friendship"));
		sc.close();

	}

}
