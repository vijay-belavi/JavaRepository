package practice;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of aray:");
		int size=sc.nextInt();
		int [] arr=new int [size];
		int find=sc.nextInt();
		System.out.println("Enter the array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			if (arr[i]==find) 
			{
				System.out.println("yes present");
			}
		}
		
	}
}
