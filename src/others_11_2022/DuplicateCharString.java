package others_11_2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateCharString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		String s = sc.next();
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(mp.containsKey(ch)) mp.put(ch, mp.get(ch) + 1);
			else mp.put(ch, 1);
		}
		
		for(Entry<Character, Integer> entry : mp.entrySet()) 
			System.out.println(entry.getKey() + " " + entry.getValue());
		sc.close();
	}

}
