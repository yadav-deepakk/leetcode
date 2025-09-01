package others_11_2022;

import java.util.Scanner;

public class EmotionalProximity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		double[] out = new double[T];
		
		for (int i=0;i<T;i++) {
			
			double P, X, Y, Z;
			P = sc.nextInt();
			X = sc.nextInt();
			Y = sc.nextInt();
			Z = sc.nextInt();
			
			if(Z == 0) {
				P -= P * (X/100);
			}else if(Z==1) {
				P += P * (Y/100);
			}
			out[i] = P;
			// System.out.println(out[i]);
		}
		
		// output the result of each test cases
		for (int j = 0; j < T; j++) System.out.println(out[j]);
		
		sc.close();
	}
}
