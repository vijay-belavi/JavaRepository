package tesTYantra;

import java.util.Scanner;

public class Stringsplit {
	public static void main(String[] args) {
		String s1 = "My name is XYZ";
		String ar[] = s1.split(" ");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].contains("XYZ")  ) {
				ar[i] = "Vijay";
				System.out.print(ar[i]+" ");
			} else {
				System.out.print(ar[i]+" ");
			}
		}
		
		System.out.println();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s2=sc.nextLine();
		String arr [] = s2.split(" ");
		System.out.println("Enter the replace word");
		String replace=sc.next();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].equals(replace))
			{
				System.out.println("Enter the new word");
				arr[i]=sc.next();
			}
		}
		String hosaString="";
		for(String var:arr)
		{
			hosaString+=var+" ";
		}
		System.out.println(s2);
		System.out.println(hosaString);
	}
}
