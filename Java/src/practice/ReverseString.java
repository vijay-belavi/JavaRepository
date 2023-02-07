package practice;

public class ReverseString {
public static void main(String[] args) {
	String s="ELF2021SELENIUM";
	String rev="";
	for (int i = s.length()-1; i >=0; i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	
	
	
	int num=12345;
	int rem = 0;
	while(num!=0)
	{
		rem = (rem*10)+num%10;
		num = num/10;
	}
	System.out.println(rem);
}
}
