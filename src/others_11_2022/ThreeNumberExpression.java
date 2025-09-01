package others_11_2022;

import java.util.Scanner;

public class ThreeNumberExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] out = new String[T];
		
		for (int i=0;i<T;i++) {
			// write code to process each test case here...
			long A, B, C;
			A = sc.nextLong(); 
			B = sc.nextLong(); 
			C = sc.nextLong(); 
			boolean flag = false;
			
			flag = ( +A+B-C == 0) ? true: false; 
			if(!flag) flag = ( +A-B+C == 0) ? true: false; 
			if(!flag) flag = ( +A-B-C == 0) ? true: false; 
			if(!flag) flag = ( -A+B+C == 0) ? true: false; 
			if(!flag) flag = ( -A+B-C == 0) ? true: false; 
			if(!flag) flag = ( -A-B+C == 0) ? true: false; 
			
			out[i] = flag ? "YES":"NO";
		}
		
		// output the result of each test cases 
		for (int j = 0; j < T; j++) System.out.println(out[j]);
		
		sc.close();
	}

}
