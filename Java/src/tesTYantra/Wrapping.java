package tesTYantra;

public class Wrapping {
	public static void main(String[] args) {
		String s1 = "1Ab2cd3#g*";
		String Up = "";
		String low = "";
		String num = "";
		String sp = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (Character.isUpperCase(ch)) {
				Up = Up + ch;
			} else if (Character.isLowerCase(ch)) {
				low = low + ch;
			} else if (Character.isDigit(ch)) {
				num = num + ch;
			} else {
				sp = sp + ch;
			}
		}
		System.out.println(Up);
		System.out.println(low);
		System.out.println(num);
		System.out.println(sp);

		// method2
		String s2 = "1Ab2cd3#g*";
		String Up1 = "";
		String low1 = "";
		String num1 = "";
		String sp1 = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s2.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				Up1 = Up1 + ch;
			} else if (ch >= 'a' && ch <= 'z') {
				low1 = low1 + ch;
			} else if (ch >= '0' && ch <= '9') {
				num1 = num1 + ch;
			} else {
				sp1 = sp1 + ch;
			}
		}
		System.out.println(Up1);
		System.out.println(low1);
		System.out.println(num1);
		System.out.println(sp1);
		
		//method3
		String s3 = "1Ab2cd3#g*";
		String Up3 = "";
		String num3 = "";
		String sp3 = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s2.charAt(i);
			if (Character.isAlphabetic(ch)) {
				Up3 = Up3 + ch;
			}  else if (Character.isDigit(ch)) {
				num3 = num3 + ch;
			} else {
				sp3= sp3 + ch;
			}
		}
		System.out.println(Up3);
		System.out.println(num3);
		System.out.println(sp3);
	}
}
