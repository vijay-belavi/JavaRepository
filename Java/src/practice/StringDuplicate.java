package practice;

public class StringDuplicate {
public static void main(String[] args) {
	String arr1[] = { "india", "selenium", "java", "programming" };
	for (int i = 0; i < arr1.length; i++) {
		String s=arr1[i];
		char ch1 [] =s.toCharArray();
		for (int j = 0; j < ch1.length; j++) {
			for (int k = j+1; k < ch1.length; k++) {
				if(ch1[j]==ch1[k]) {
					ch1[k]='A';
				}
			}  
		}
		for (int j = 0; j < ch1.length; j++) {
			if(ch1[j]!='A')
			{
				System.out.print(ch1[j]);
			}
		}
		System.out.println();
	}
}
}
