package codeforces_11_2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Games {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> h_mp = new HashMap<Integer, Integer>();
		Map<Integer, Integer> g_mp = new HashMap<Integer, Integer>();
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			
			int h = sc.nextInt();
			int g = sc.nextInt();
			
			if(h_mp.containsKey(h)) h_mp.put(h, h_mp.get(h)+1); 
			else h_mp.put(h, 1);
			
			if(g_mp.containsKey(g)) g_mp.put(g, g_mp.get(g)+1);
			else g_mp.put(g, 1);
			
		}
		
		int count = 0;
		
		for(Map.Entry<Integer, Integer> h_entry : h_mp.entrySet()) {
			
			int k = h_entry.getKey();
			int v = h_entry.getValue();
			
			// System.out.println("h_key=" + k + ", h_value=" + v);
			// System.out.println("g_key=" + k + ", g_value=" + g_mp.get(k));
			
			if (g_mp.get(h_entry.getKey()) != null) count += h_entry.getValue() * g_mp.get(h_entry.getKey());
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
