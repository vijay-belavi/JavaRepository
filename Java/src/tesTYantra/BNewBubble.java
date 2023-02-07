package tesTYantra;

import java.util.Arrays;

public class BNewBubble {
	public static void main(String[] args) {
		int a[] = { 2, 1, 5, 6, 4, 2, 5, 6, 5, 8, 3, 1, 5, 1, 4, 2 };
		int b[] = new int[a.length];
		Arrays.sort(a);
		int k = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				b[k] = a[i];
				k++;
			}
		}
		b[k] = a[a.length - 1];
		for (int i = 0; i <= k; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
