package codeforces_11_2022;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class AmusingJoke {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> s_mp = new HashMap<Character, Integer>();
		
		String s = sc.next();
		s += sc.next();
		String pile_s = sc.next();
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(!s_mp.containsKey(ch)) s_mp.put(ch, 1);
			else s_mp.put(ch, s_mp.get(ch) +1);
		}
		
		// System.out.println("s_mp=" + s_mp);
		boolean is_extra_flag = false;
		for(int i=0; i<pile_s.length(); i++) {
			
			char ch = pile_s.charAt(i);
			if(s_mp.containsKey(ch)) {
				
				int occ_count = s_mp.get(ch)-1; 
				if(occ_count == 0)  s_mp.remove(ch);
				else s_mp.put(ch, occ_count);
				
			}else {
				is_extra_flag = true;
			}
			
		}
		
		// System.out.println("s_mp=" + s_mp + ", extra character in pile? = " + is_extra_flag);
		System.out.println( s_mp.isEmpty() && is_extra_flag != true  ? "YES":"NO");
		
		sc.close();
	}

}
