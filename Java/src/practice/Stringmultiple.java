package practice;

public class Stringmultiple {
	public static void main(String[] args) {
		String arr[] = { "india", "selenium", "java", "programming" };
		String rev = "";
		for (int i = 0; i < arr.length; i++) {
			rev = rev + arr[i];
		}
		System.out.println(rev);
		char ch[] = rev.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = 'A';
				}
			}
			if (count >= 1 && ch[i]!='A') {
				System.out.println(ch[i]+" "+count);
			}
		}
	}
}