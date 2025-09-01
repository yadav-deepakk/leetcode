package others_11_2022;

import java.util.Scanner;

public class LuckyNumber2RaisedToEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] out = new int[T];
		
		for (int i=0;i<T;i++) {
			
			long n = sc.nextLong();
			boolean flag = true;
			while(n%2 == 0) {
				n/=2;
				flag = !flag;
			};
			// System.out.println("n="+N +", flag="+flag+ ", count="+count);
			
			out[i] = flag ? 1:0;
		}
		
		// output the result of each test cases
		for (int j = 0; j < T; j++) System.out.println(out[j]);
		
		sc.close();

	}

}
