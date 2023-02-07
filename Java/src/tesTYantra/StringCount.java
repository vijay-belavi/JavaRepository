package tesTYantra;

public class StringCount {
	public static void main(String[] args) {
		String s1 = "Rajesh is my name";
		String[] a = s1.split(" ");
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			b = b + a[i].length();
		}
		System.out.println(b);

		String s2 = "Vijay is my name";
		s2 = s2.replace(" ", "");
		System.out.println(s2.length());

		String s3 = "Rajesh is my name";
		int count = 0;
		for (int i = 0; i < s3.length(); i++) {
			char ch = s3.charAt(i);
			if (ch!= ' ') {
				count++;
			}
		}
		System.out.println(count);

	}
}
