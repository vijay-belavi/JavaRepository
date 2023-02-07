package practice;

public class Stringdup {
public static void main(String[] args) {
	String s="my name is Varun";
	String s1=s.replace(" ", "");
	char ch [] = s1.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		int count=1;
		for (int j = i+1; j < ch.length; j++) {
			if(ch[i]==ch[j])
			{
				count++;
				ch[j]='A';
				
			}
		}
		if(count>=1&&ch[i]!='A') {
			System.out.println(ch[i]+" "+count);
		}
	}
}
}
