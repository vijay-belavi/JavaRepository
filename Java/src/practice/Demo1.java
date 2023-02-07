package practice;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Demo1 {
	public static void main(String[] args) {
		String s="karnataka";
		char [] arr=s.toCharArray();
		System.out.println("hiii");
		Map<Character, Integer> r=new TreeMap<Character, Integer>();
		for(char b:arr)
		{
			if(!r.containsKey(b))
			{
				r.put(b,1);
			}
			else
			{
				int count =r.get(b);
				r.put(b, count+1);
			}
		}
		for(Entry<Character, Integer> h:r.entrySet())
		{
			if(h.getValue()==1)
			{
				System.out.println(h.getKey()+" "+h.getValue());
			}
		}
		System.out.println("hii");
	}
}