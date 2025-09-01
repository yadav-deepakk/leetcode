package codeforces_10_2022;


import java.util.Scanner;
import java.lang.Math;

public class BeautifulMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		byte[] pos1 = new byte[2];
		byte[] matrix_size = {5,5};
		
		for (byte i=1;i<=5;i++) {
			for(byte j=1;j<=5;j++) {
				if(sc.nextInt()==0) continue;
				else {
					pos1[0] = i;
					pos1[1] = j;
				}
			}
		}
		
//		System.out.println("position of 1 is: " + pos1[0] + "," + pos1[1]);
//		System.out.println("position of center is: " + (matrix_size[0]/2+1) + "," + (matrix_size[1]/2+1));

		
		byte step_count = (byte) (Math.abs(matrix_size[0]/2-pos1[0]+1) + Math.abs(matrix_size[1]/2-pos1[1]+1));
		
		System.out.println(step_count);
		sc.close();
	}

}
