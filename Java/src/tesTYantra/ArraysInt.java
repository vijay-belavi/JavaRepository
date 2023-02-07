package tesTYantra;

import java.util.Scanner;

public class ArraysInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		String[] arr = new String[size];
		int count = 0;
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
			if (arr[i].contains("A")) {
				count++;
			}

		}
		System.out.println(count);

		// method2
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("A")) {
				System.out.println(arr[i]);
			}
		}
		
		//method3
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the size");
		int size1 = sc.nextInt();
		String[] arr1 = new String[size1];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr1.length; i++) {
			arr[i] = sc.next();
			}
		int count1=0;
		for(String var:arr)
		{
			if(var.contains("a")||var.contains("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}