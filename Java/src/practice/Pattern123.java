package practice;

public class Pattern123 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if (i % 2 == 1) {
					if (j % 2 == 1) {
						System.out.print(1+" ");
					} else {
						System.out.print(0+" ");
					}
				} else {
					if (j % 2 == 1) {
						System.out.print(0+" ");
					} else {
						System.out.print(1+" ");
					}
				}
			}
			System.out.println();
		}
	}
}
