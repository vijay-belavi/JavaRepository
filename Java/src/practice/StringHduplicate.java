package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringHduplicate {
public static void main(String[] args) {
	String s = "hi hello welcome to your home town";
	String s1=s.replace(" ", "");
	char ch []=s1.toCharArray();
	Map<Character, Integer> r = new HashMap<Character, Integer>();
	for (char c : ch) {
		if(!r.containsKey(c))
		{
			r.put(c, 1);
		}
		else
		{
			int count = r.get(c);
			r.put(c, count+1);
		}
	}
	for(Entry<Character, Integer> d : r.entrySet())
	{
		if(d.getKey()=='h')
		{
			System.out.println(d.getKey()+" "+d.getValue());
		}
	}
}
}
