package coursera.algorithmictoolbox;

import java.util.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
    	int refillCount=0, start=0;
    	int i=0;
    	while (i<stops.length) {
    		if(stops[i]-start>tank) {
    			return -1;
    		}
			while(i<stops.length && stops[i]-start<=tank) {
				i++; // keep moving...
			}
			if(dist-start>tank) {
				start = stops[i-1];
	    		refillCount++;
	    		// System.out.println("Refilled at i="+(i-1)+" "+"Stop="+stops[i-1]);
			}
			if(start==stops[stops.length-1] && dist-start>tank) {
				return -1;
			}
    	}
    	return refillCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i=0;i<n;i++) {
            stops[i] = scanner.nextInt();
        }
        System.out.println(computeMinRefills(dist, tank, stops));
        scanner.close();
    }
}

/*
950
400
4
200 375 550 750

10
3
4 
1 2 5 9

200
250
2
100 150


500
200
4
100 200 300 400

700
200
4
100 200 300 400
*/
