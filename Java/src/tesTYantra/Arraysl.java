package tesTYantra;

import java.util.Scanner;

public class Arraysl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		String[] arr = new String[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		int count = 0;
		String s1 = "";
		for (int i = 0; i < arr.length - 1; i++) {
			int sum = arr[i].length();
			if (count < sum) {
				count = arr[i].length();
				s1 = arr[i];
			}
		}
		System.out.println(s1 + " " + count);

		System.out.println();

	// method2
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size1 = sc.nextInt();
		String[] arr1 = new String[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.next();
		}
		int count1 = 0;
		String s2 = "";
		for (String var : arr1) {
			if (var.length() > count1) {
				count1 = var.length();
				s2 = var;
			}
		}
		System.out.println(s2 + " " + count1);
	}
}
