package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Intcount {
	public static void main(String[] args) {
		String s = "hi hello welcome hello hi banglore";
		String d=s.replace(" ", "");
		char ch[] = d.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = 'A';
				}
			}
			if (ch[i]>1 && ch[i]!= 'A') {
				System.out.println(ch[i]+" "+count);
			}
		}
		for (int i = 0; i <6; i++) {
			System.out.println();
		}
		
		String s1 = "hi hello welcome hello hi banglore";
		String d1=s1.replace(" ", "");
		char cd [] = d1.toCharArray();
		Map<Character, Integer> l1=new HashMap<Character, Integer>();
		for (char c  : cd) {
			if(!l1.containsKey(c)) {
				l1.put(c, 1);
			}
			else
			{
				int count = l1.get(c );
				l1.put(c, count+1);
			}
		}
		for (Entry<Character, Integer> a : l1.entrySet()) {
			System.out.println(a.getKey()+" "+a.getValue());
		}
	}  
}
