package tesTYantra;

public class StirngFun {
	public static void main(String[] args) {
		//method1
		String name = "Rajesh Is My Name";
		char[] name1 = name.toCharArray();
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < name1.length; i++) {
			if (Character.isUpperCase(name1[i])) {
				count++;
			} else if (Character.isLowerCase(name1[i])) {
				count1++;
			}  
		}
		System.out.println("Uppercase"+count);
		System.out.println("Lowercase"+count1);
		
		//method2
		String name3 = "Rajesh Is My Name";
		char[] name4 = name.toCharArray();
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < name1.length; i++) {
			if (Character.isUpperCase(name1[i])) {
				count++;
			} else if (Character.isLowerCase(name1[i])) {
				count1++;
			}  
		}
		System.out.println("Uppercase"+count);
		System.out.println("Lowercase"+count1);
	}
}
