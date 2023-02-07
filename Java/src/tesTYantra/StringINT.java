package tesTYantra;

public class StringINT 
{
	public static void main(String[] args) 
	{
		String name="My1 name2 is3 Rajesh4 Singh5";
		char [] ch=name.toCharArray();
		int sum=0;
		for(int i=0; i<ch.length; i++)
		{
			
			if(Character.isDigit(ch[i]))
			{
				String a=""+ch[i];
				int b=Integer.parseInt(a);
				sum=sum+b;
			}
		}
		System.out.println(sum);
	
	
	//method3
	String name1="My1 name2 is3 Rajesh4 Singh5";
	int sum1=0;
	for(int i=0; i<name1.length(); i++)
	{
		String num="";
		char var=name1.charAt(i);
	}
}
}