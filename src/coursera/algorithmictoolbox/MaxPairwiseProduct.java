package coursera.algorithmictoolbox;

import java.util.*;

public class MaxPairwiseProduct {
	
	static long findMaxPairwiseProduct(long[] arr) {
        int ind1=0, ind2=0;
        
        if(arr.length == 2) return arr[0] * arr[1];
        
        for(int i=1; i<arr.length; i++){
        	long temp = arr[i];
            if(arr[ind1]<temp) ind1=i;
        }
        
        for(int i=1; i<arr.length; i++){
        	long temp = arr[i];
            if(arr[ind2]<temp && i!=ind1) ind2=i;
        }
        
        // System.out.println(ind1 + " " + ind2);
        
        return arr[ind1] * arr[ind2];
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLong();
        }
        System.out.println(findMaxPairwiseProduct(numbers));
        
        scanner.close();
    }

}
