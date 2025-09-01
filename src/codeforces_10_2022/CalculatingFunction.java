package codeforces_10_2022;


// Note: Partially Solved //
import java.util.Scanner;

public class CalculatingFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		long a1=1, a2=2, d=2;

		long n1, n2;
		n1 = (N%2 != 0) ? N/2 + 1: N/2;
		n2 = N/2;

		long s1 = ((2*a1 + (n1-1) * d) * n1) / 2; 		// sum of all negative numbers;
		long s2 = ((2*a2 + (n2-1) * d) * n2) / 2;		// sum of all positive numbers;
		
		long sum = s2 - s1;
		System.out.println(sum);
		
		sc.close();
	}

}
