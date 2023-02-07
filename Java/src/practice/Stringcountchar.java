package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Stringcountchar {
	public static void main(String[] args) {
		String s1 = "my name is mohan and i am from mangalore";
		String d = s1.replace(" ", "");
		char ch[] = d.toCharArray();
		Map<Character, Integer> a = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (!a.containsKey(c)) {
				a.put(c, 1);
			} else {
				int count = a.get(c);
				a.put(c, count + 1);
			}
		}
		for (Entry<Character, Integer> e : a.entrySet()) {
			if (e.getValue() > 1) {
				System.out.println(e.getKey());
			}
		}
	}
}
