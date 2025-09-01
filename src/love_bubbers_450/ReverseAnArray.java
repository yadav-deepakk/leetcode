package love_bubbers_450;

import java.util.Scanner;

public class ReverseAnArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		// int[] rev_arr = reverseArray1(arr, 0, n-1);
		int[] rev_arr = reverseArray2(arr, 0, n-1);
		for(int i=0;i<n;i++) System.out.print(rev_arr[i] + " ");
		
		sc.close();
		
	}
	
	// using same array
	public static int[] reverseArray1(int[] arr, int start, int end) {

		while(start<end) {
			arr[start] = arr[start] + arr[end];
			arr[end] = arr[start] - arr[end];
			arr[start] = arr[start] - arr[end];
			
			start++;
			end--;
		}
		
		return arr;
	}
	
	// using one more array
	public static int[] reverseArray2(int[] arr, int start, int end) {
		int[] r_arr = new int[end+1];
		for(int i=end;i>=0;i--) r_arr[start++] = arr[i];
		
		return r_arr;
	}
}
