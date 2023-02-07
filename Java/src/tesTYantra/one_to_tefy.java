package tesTYantra;

public class one_to_tefy 
{
	int hi()
	{
		int no=6;
		int fact=1;
		for (int i = 6; i >=1; i--) 
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) 
	{
		one_to_tefy t = new one_to_tefy();
		int d=t.hi();
		System.out.println(t.hi());
		System.out.println(d);
	}
}