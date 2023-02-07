package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class sTRINGCOUNT {
public static void main(String[] args) {
	String s= "my name is mohan and i am from mangalore";
	String s1=s.replace(" ", "");
	Map<Character, Integer> r= new HashMap<Character, Integer>();
	char ch []=s1.toCharArray();
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
	for (Entry<Character, Integer> d : r.entrySet()) {
		if(d.getValue()>1) {
			System.out.println(d.getKey()+" "+d.getValue());
		}
	}
}
}
