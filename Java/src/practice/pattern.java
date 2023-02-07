package practice;

public class pattern 
{
	public static void main(String[] args) 
	{
		int star=5;
		int space=0;
		for (int i = 1; i <=5; i++) 
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <=star; k++) 
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
			space++;
		}
		
		
		int star1=9;
		int space1=0;
		for (int i = 1; i <=5; i++) 
		{
			for(int j=1; j<=space1; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <=star1; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
			star1=star1-2;
			space1++;
		}
		
		int star2=5;
		int space2=0;
		for (int i = 1; i <=5; i++) 
		{
			for(int j=1; j<=space2; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <=star2; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
			star2--;
			space2++;
		}
		
		int star3=5;
		for (int i = 1; i <=5; i++) 
		{
			
			for (int k = 1; k <=star3; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
			star3--;
		}
		
		int star4=5;
		int space4=0;
		for (int i = 1; i <=5; i++) 
		{
			for(int j=1; j<=space4; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <=star4; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
			star4--;
			space4++;
		}
	}
}
