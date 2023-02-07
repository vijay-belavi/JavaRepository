package practice;

public class ShuffleString {
public static void main(String[] args) {
	String s="My name is Manoj and hello";
	String arr [] = s.split(" ");
	for (int i = 0; i < arr.length; i++) {
			if (i==0) {
				String rev="";
				for (int j = arr.length/2; j >=0 ; j--) {
					rev=rev+arr[i];
		}
	}
}
}
}