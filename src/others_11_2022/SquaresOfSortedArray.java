package others_11_2022;

import java.util.Scanner;

public class SquaresOfSortedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a, b;
		a = new int[n];
		b = new int[n];
		for(int i=0;i<n;i++) a[i] = sc.nextInt();
		
		Solution1 obj = new Solution1();
		b = obj.sortedSquares(a);
		
		for(int j=0;j<n;j++) System.out.print(b[j] + " ");

		sc.close();
	}
}


class Solution1 {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int s=0, e=nums.length-1, i=nums.length-1;
        int sq1, sq2;
        sq1 = nums[s] * nums[s];
        sq2 = nums[e] * nums[e];

        for(int j=0; j<nums.length; j++) arr[j] = -1;

        while(i>=0){
            if(sq2>sq1) {
                arr[i--] = sq2;
                sq2 = nums[--e] * nums[e];
            }
            else{
                arr[i--] = sq1;
                sq1 = nums[++s] * nums[s];
            }
        }

        return arr;
    }
}
