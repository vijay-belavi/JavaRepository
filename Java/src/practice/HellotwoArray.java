package practice;

import java.util.Scanner;

public class HellotwoArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row size:");
	int row=sc.nextInt();
	System.out.println("Enter the cel size:");
	String [] [] arr= new String [row] [] ;
	for (int i = 0; i < arr.length; i++) {
		arr[i] = new String[sc.nextInt()];
		System.out.println("Enter the elements: ");
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j]=sc.next();
		}
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
}
}
