package codeforces_11_2022;

import java.util.Scanner;

public class AntonAndPolyhedrons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] p = {
				{4, 0}, {6, 0}, {8, 0}, {12, 0}, {20, 0}
		};
		
		int n = sc.nextInt();
		
		while(n-->0) {
			
			String s = sc.next();
			if(s.equalsIgnoreCase("Tetrahedron")) p[0][1]++;
			if(s.equalsIgnoreCase("Cube")) p[1][1]++;
			if(s.equalsIgnoreCase("Octahedron")) p[2][1]++;
			if(s.equalsIgnoreCase("Dodecahedron")) p[3][1]++;
			if(s.equalsIgnoreCase("Icosahedron")) p[4][1]++;
			
		}
		
		int sum = 0;
		for(int i=0;i<p.length; i++) sum += p[i][0] * p[i][1];
		System.out.println(sum);

		sc.close();
	}

}
