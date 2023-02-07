package tesTYantra;

public class StringUN {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		
		
		
		for(int i=1; i<=4; i++)
		{
			for(int n=1; n<=i; n++)
			{
				System.out.print(n*i+" ");
			}
			System.out.println();
		}
	}
}