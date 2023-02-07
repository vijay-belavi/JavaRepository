package tesTYantra;

public class StringRev {
	public static String rev(String s1)
	{
		String rev="";
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev+=s1.charAt(i);
		}
		return rev;
	}
public static void main(String[] args) {
	//method1  
	String name="Rajesh Is My Name";
	String[] arr=name.split(" ");
	for(String a:arr)
	{
		String rev="";
		for(int i=a.length()-1; i>=0; i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.print(rev+" ");
	}
	System.out.println();
	
	
	//method2
	String name1="Rajesh Is My Name";
	String [] abb=name1.split(" ");
	
	for (int i = 0; i < abb.length; i++)
	{
		  String abc=abb[i];
		  String rev1="";
		  for (int j = abc.length()-1; j>=0; j--) {
			rev1=rev1+abc.charAt(j);
		}
		  System.out.print(rev1+" ");
	}
	System.out.println();
	
	//method3
	String s="Rajesh Is My Name";
	String [] acc=s.split(" ");
	String hosaString="";
	for(String var:arr)
	{
		hosaString+=rev(var)+" ";
	}
	System.out.println(hosaString);
}
}
