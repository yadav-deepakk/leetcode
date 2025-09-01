package others_11_2022;

import java.util.Scanner;

public class RotateArrayK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++) nums[i] = sc.nextInt();
		
		int k = sc.nextInt();
		
		Solution obj = new Solution();
		int[] a = obj.rotate(nums, k);
		
		for(int num: a) {
			System.out.print(num + " ");
		}
		
		sc.close();
	}

}

class Solution {
    public int[] rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int index = (i+k) % nums.length;
            arr[index] = nums[i];
        } 
        return arr;
    }
}

/*
class Solution {
    public void reverse(int[] nums, int start, int end)
    {
        while(start<end)
        {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++; end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int start = 0, end = nums.length;
        k = k % end;
        int mid = end - k;

        reverse(nums, start, mid-1);
        reverse(nums, mid, end-1);
        reverse(nums, start, end-1);
    
    }
}
*/