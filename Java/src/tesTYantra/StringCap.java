package tesTYantra;

public class StringCap {
	public static String reverse(String s1)
	{
		String rev="";
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev+=s1.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		String name = "My name is Rajesh Singh";
		String[] arr = name.split(" ");
		for (String s : arr) {
			if (Character.isUpperCase(s.charAt(0))) {
				String rev = "";
				for (int i = s.length() - 1; i >= 0; i--) {
					rev = rev + s.charAt(i);
				}
				System.out.print(rev + " ");
			} else {
				System.out.print(s + " ");
			}
		}
		System.out.println();
		
		
		//method2
		String nam="My name is Rajesh Singh";
		String abb[] =name.split(" ");
		String hosaString="";
		for(String var:arr)
		{
			char ch=var.charAt(0);
			String rev="";
			if(ch>='A'&&ch<='Z')
			{
				hosaString+=reverse(var)+" ";
			}
			else
			{
				hosaString+=var+" ";
			}
		}
		System.out.println(nam);
		System.out.println(hosaString);
	}
}
