package love_bubbers_450;

import java.util.Scanner;

public class Sort012Array {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) a[i] = sc.nextInt();
		
        // code here 
        int c0, c1, c2;
        c0 = c1 = c2 = 0;
        for (int i=0;i<n;i++){
            if(a[i]==0) c0++;
            else if(a[i]==1) c1++;
            else c2++;
        }
        int index = 0;
        while (c0-->0) a[index++] = 0;
        while (c1-->0) a[index++] = 1;
        while (c2-->0) a[index++] = 2;
        
        for(int i=0;i<n;i++) System.out.print(a[i] + " ");
        
        sc.close();
    }
}
