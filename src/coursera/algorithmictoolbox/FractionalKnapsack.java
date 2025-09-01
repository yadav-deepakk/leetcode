package coursera.algorithmictoolbox;

import java.util.Scanner;

public class FractionalKnapsack {
	private static int getBestItem(int[] v, int[] w) {
		int b=0, n=w.length;
		for (int i=1; i<n; i++) {
			if(w[i]>0) {
				if((double) v[i]/w[i] > (double) v[b]/w[b]) {
					b=i;
				}
			}
		}
		return b;
	}
	
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double totalValue = 0;
        int[] amounts = new int[weights.length];
        //write your code here
        for(int i=0; i<values.length; i++) {
        	// System.out.println("i="+i);
        	if(capacity>0) {
        		int b = getBestItem(values, weights);
        		int w = Math.min(capacity, weights[b]);
        		totalValue += ((double)values[b]/weights[b]) * w;
        		amounts[b] += w;
        		weights[b] -= w;
        		capacity -= w;
        		if(capacity==0) break;
        	}
        }

        // for(int i=0; i<weights.length; i++) System.out.print(amounts[i] + " ");
        // System.out.println("\n"+totalValue);
        
        return totalValue;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i=0; i<n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
        scanner.close();
    }
}

/*
3 50
60 20
100 50
120 30

1 10
500 30
*/
