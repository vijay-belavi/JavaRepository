package practice;

public class Pattern12 {
	public static void main(String[] args) {
		int k = 1, n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					System.out.print((i * (n / 2) - j) + " ");
				} else {
					System.out.print(k + " ");
					k++;
				}
			}
			System.out.println();
		}
	}
}
