package tesTYantra;

public class Stringsitch 
{
	public static void main(String[] args) 
	{
		String key= "1J@A3V$$%a";
		String alpha="";
		String num="";
		String sp="";
		for(int i=0; i<key.length(); i++)
		{
			char var=key.charAt(i);
			int val=0;
			if(Character.isAlphabetic(var))
			{
				val=1;
			}
			else if(Character.isDigit(var))
			{
				val=2;
			}
			else
			{
				val=3;
			}
			switch (val) {
			case 1:
				alpha=alpha+var;
				break;
			case 2:
				num=num+var;
				break;
			case 3:
				sp=sp+var;
				break;
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(sp);
	}
}