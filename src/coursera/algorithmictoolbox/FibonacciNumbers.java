package coursera.algorithmictoolbox;

import java.util.Scanner;

public class FibonacciNumbers {
	public static long naivAlgoFibNum(int n) {
		return (n==1 || n==0) ? 1 : (long) naivAlgoFibNum(n-1) + naivAlgoFibNum(n-2);
	}
	
	public static long fib(int n) {
		if(n<=1) return n;
		long a=0, b=1, c=0;
		for(int i=1; i<n; i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
	
	public static long lastDigitFib(int n) {
		if(n<=1) return n;
		long a=0, b=1, c=0;
		for(int i=1; i<n; i++) {
			c=(a+b) % 10;
			a=b;
			b=c;
		}
		return c;
	}
	
	public static long hugeFib(long n, long m) {
		
		if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current ) % m;
        }

        return current % m;
	}
	
	public static long lastDigOfSumOfFib(long n) {
		if(n<=1) return n;
		long a=0, b=1, c=0, sum=0;
		for(long i=1; i<n; i++) {
			c = (a+b) % 10;
			a = b;
			b = c;
			sum = (sum + c) % 10;
		}
		return sum % 10;
	}
	
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
				
		System.out.print(hugeFib(n,m));

		sc.close();
	}
}
