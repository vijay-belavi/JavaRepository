package practice;

import java.util.Scanner;

public class Hii
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		String a= sc.next();
		String b=sc.next();
		a=b+a;
		b=b+a;
		System.out.println(b);
		System.out.println(a);
	}
}
