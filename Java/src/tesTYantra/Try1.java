package tesTYantra;

import java.util.ArrayList;

public class Try1 {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		// ArrayList<Integer> l2 = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			l1.add(i);
		}
		for (Object a : l1) {
			int l = (int) a;
			if (l % 2 != 0) {
				System.out.println(l);
			}
		}
	}
}
