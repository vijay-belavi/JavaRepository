package tesTYantra;

import java.util.Arrays;

public class BubbleSortAsc {
	public static void main(String[] args) {
		int[] arr = { 7, 4, 2, 41, 1, 9, 0 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

		System.out.println();

		// method2
		int[] arr1 = { 7, 4, 2, 41, 1, 9, 0 };
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// method3
		int[] arr2 = { 7, 4, 2, 41, 1, 9, 0 };
		Arrays.sort(arr2);
		for (int a : arr2) {
			System.out.print(a+" ");
		}
		
	}
}
