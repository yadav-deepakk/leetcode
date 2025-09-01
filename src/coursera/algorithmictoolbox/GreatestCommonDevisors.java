package coursera.algorithmictoolbox;

import java.util.Scanner;

public class GreatestCommonDevisors {
	public static long naiveAlgoGCD(long m, long n) {
		long gcd = 0;
		for (int i=1; i<Math.max(m, n); i++) {
			if(n%i==0 && m%i==0) gcd = i;
		}
		return gcd;
	}
	
	public static long lcm(long a, long b) {
		return (a*b)/gcd(a,b);
	}
	
	public static long gcd(long a, long b) {
		return (a%b == 0) ? b:gcd(b, a%b);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long a, b;
		a = scan.nextLong();
		b = scan.nextLong();
		// System.out.println(gcd(a,b));
		System.out.println(lcm(a,b));
		scan.close();
		
	}

}
