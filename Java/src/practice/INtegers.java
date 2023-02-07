package practice;

public class INtegers {
	public static void main(String[] args) {
		int arr[] = { 28, 45, 36, 87, 66, 55, 99 };
		int firstL = 0;
		int secondL = 0;
		int thirdL = 0;
		for (int i = 0; i < arr.length; i++) {
			if (firstL < arr[i]) {
				thirdL = secondL;
				secondL = firstL;
				firstL = arr[i];
			} else if (secondL < arr[i]) {
				thirdL = secondL;
				  secondL = arr[i];
				
			} else if (thirdL < arr[i]) {
				thirdL = arr[i];
			}
		}
		System.out.println(firstL);
		System.out.println(secondL);
		System.out.println(thirdL);
		System.out.println(firstL+secondL+thirdL);
	}  
}
