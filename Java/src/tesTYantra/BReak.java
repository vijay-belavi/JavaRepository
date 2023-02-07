package tesTYantra;

class One
{
	public void hi()
	{
		System.out.println("Hi");
	}
}
class Two extends One
{
	public void hello()
	{
		System.out.println("Hello");
	}
}
public class BReak 
{
	public static void main(String[] args) 
	{
		One t=new Two();
		Two t1=(Two) t;
		t1.hi();
		t1.hello();
		t.hi();  
	}
}
