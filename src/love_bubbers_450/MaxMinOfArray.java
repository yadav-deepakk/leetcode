package love_bubbers_450;

import java.util.Scanner;

public class MaxMinOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		n = sc.nextInt();
		int[] arr = new int[n];
		// System.out.println("Max="+max+" Min="+min);
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max) max = arr[i];
			if(arr[i]<min) min = arr[i];
		}
		System.out.println(max + " " + min);
		sc.close();
	}

}
