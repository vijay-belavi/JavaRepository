package tesTYantra;

public class String123 {
	public static void main(String[] args) {
		String s1 = "Raj  esh";
		String rev = "";
		char [] s2=s1.toCharArray();
		for(char var:s2)
		{
			if(var>='A'&& var<='Z')
			{
				String u=""+var;
				rev=rev+u.toLowerCase();   
			}
			else
			{
				String l=""+var;
				rev=rev+l.toUpperCase();
			}
		}
		System.out.println(rev);
	}
}
