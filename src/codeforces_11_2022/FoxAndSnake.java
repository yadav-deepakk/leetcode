package codeforces_11_2022;

import java.util.Scanner;

public class FoxAndSnake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();
		
		boolean is_hash_start = false;
		for(int i=1; i<=n; i++) {
			
			// i is odd print m times '#'
			if(i%2 != 0) 
				for(int j=1; j<=m; j++) {
					System.out.print("#");
				}

			// i is even print m-1 times '.' and one # (before or after . depending upon is_hash_start value
			// also toggle is_hash_start)
			else {
				String s = is_hash_start ? "#" : "";	// initialize with # if is_hash_start
				for(int j=1; j<=m-1; j++) {
					s += ".";
				}
				s += !is_hash_start ? "#":"";		// # required at the end if !is_hash_start
				System.out.print(s);
				is_hash_start = !is_hash_start;
			}
			
			System.out.println("");
			
		} // external for loop end 
		
		sc.close();
		
	}

}
