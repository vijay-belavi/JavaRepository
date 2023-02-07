package tesTYantra;

public class TwoArray {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10, 32, 23, 23, 4 } };
		for (int i = 0; i < arr.length; i++) {
			int a[]=arr[i];
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//method2
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i  ][j] + " ");
			}
			System.out.println();
		}
	}
}