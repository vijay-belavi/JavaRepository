package tesTYantra;

import java.util.Scanner;

public class MethodReturn 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	String arr [] [] = new String[3][];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = new String[sc.nextInt()];
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j] = sc.next();
		}
	} 
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	
	

}
}
